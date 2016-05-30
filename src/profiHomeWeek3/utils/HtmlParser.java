package profiHomeWeek3.utils;

import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.List;

public class HtmlParser {

    public static List<String> parse(Element el, String selector, String attribute) {

        List<String> list = new ArrayList<>();

        Elements elements = el.select(selector);

        for (Element element : elements) {
            list.add(element.attr(attribute));
        }

        return list;
    }
}
