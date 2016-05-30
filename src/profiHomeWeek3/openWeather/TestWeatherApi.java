package profiHomeWeek3.openWeather;

import com.google.gson.Gson;
import profiHomeWeek3.utils.NetUtils;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class TestWeatherApi {

    public static final String WEB_PATH =
            "http://api.openweathermap.org/data/2.5/weather?q=Kiev,ua&appid=e962ca86a64e342603c7da6c403847d6";
    public static final String MY_FILE_PATH = "/home/jessy/IdeaProjects/CurrentWork/resources/currentWeatherKiev.json";

    public static void main(String[] args) throws URISyntaxException, IOException {

        URI uri = new URI(WEB_PATH);
        URL url = uri.toURL();

        String json = NetUtils.urlToString(url);
        System.out.println(json);

        Gson gson = new Gson();
        Example example = gson.fromJson(json, Example.class);

        System.out.println("\nWriting GSON to file ....");
        try (FileWriter fileWriter = new FileWriter(MY_FILE_PATH)) {
            gson.toJson(example, fileWriter); // writing to file
        }

        System.out.println("\nReading from file.. ");
        Example example2 = gson.fromJson(new FileReader(MY_FILE_PATH), Example.class);
        System.out.println(example2); // reading from file

    }
}
