package profiHomeWeek3.ex_ua;

import com.google.gson.Gson;
import org.json.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import profiHomeWeek3.utils.HtmlParser;
import profiHomeWeek3.utils.NetUtils;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;

public class TestExUaParserInfo {

    public static void main(String[] args) throws URISyntaxException, IOException {

        URI uri = new URI(Constants.CLIP_PATH);
        URL url = uri.toURL();

        String html = NetUtils.urlToString(url);
        System.out.println(html);

        Document doc = Jsoup.parse(html);
        Element el = doc.body();

        //all download links
        List<String> linksList = HtmlParser.parse(el, "a[href^=/get]", "href");

        //all clips names
        List<String> namesList = HtmlParser.parse(el, "a[href^=/get]", "title");

        //all clips pics
        List<String> picsList = HtmlParser.parse(el, "img[src]", "src");

        //find file
        String linkFile = "";
        for (int i = 0; i < linksList.size(); i++) {
            String currentName = namesList.get(i);
            String current = linksList.get(i);
            if (currentName.contains("mp4")) {
                linkFile = "http://www.ex.ua/get/" + current.substring(5);
                i = linksList.size();
            }
        }
        System.out.println("Link for file is: " + linkFile);

        //find name
        String clipName = "";
        for (int i = 0; i < namesList.size(); i++) {
            String current = namesList.get(i);
            if (current.contains("mp4")) {
                clipName = current.substring(0, current.length()-4);
                i = namesList.size();
            }
        }
        System.out.println("Name file is: " + clipName);

        //find best pic
        String linkPic = "";
        for (int i = 0; i < picsList.size(); i++) {
            String current = picsList.get(i);
            if (current.contains("show")) {
                linkPic = current.substring(0, current.indexOf("?"));
                i = picsList.size();
            }
        }
        System.out.println("Link pic is: " + linkPic);

        //create object Clip
        Gson gson = new Gson();

        String jsonForClip = new JSONObject()
                .put("name", clipName)
                .put("link", linkFile)
                .put("picLink", linkPic).toString();
        System.out.println(jsonForClip);

        ClipInfo clip = gson.fromJson(jsonForClip, ClipInfo.class);

        System.out.println("\nWriting GSON to file ....");
        try (FileWriter fileWriter = new FileWriter(Constants.LOCAL_JSON_PATH)) {
            gson.toJson(clip, fileWriter); // writing to file
        }

        System.out.println("\nReading from file.. ");
        ClipInfo clipCopy = gson.fromJson(new FileReader(Constants.LOCAL_JSON_PATH), ClipInfo.class);
        System.out.println(clipCopy.toString()); // reading from file
    }
}
