package profiHomeWeek3.ex_ua;

public class ClipInfo {

    private String name;
    private String link;
    private String picLink;

    public ClipInfo() {
    }

    public ClipInfo(String name, String link, String picLink) {
        this.name = name;
        this.link = link;
        this.picLink = picLink;
    }

    @Override
    public String toString() {
        return "ClipInfo{" +
                "name='" + name + '\'' +
                ", link='" + link + '\'' +
                ", picLink='" + picLink + '\'' +
                '}';
    }
}
