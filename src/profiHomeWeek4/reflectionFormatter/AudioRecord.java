package profiHomeWeek4.reflectionFormatter;

public class AudioRecord {

    public long id;
    @Info(name = "ARTIST")
    public String artist;
    @Info(name = "NAME")
    public String name;
    @Info(name = "TIME")
    public int timeInSec;
    @Info(name = "FORMAT")
    public FormatAudio formatAudio;

    public AudioRecord() {
    }

    public AudioRecord(String artist, String name, int timeInSec, FormatAudio formatAudio) {
        this.id = id++;
        this.artist = artist;
        this.name = name;
        this.timeInSec = timeInSec;
        this.formatAudio = formatAudio;
    }

    public long getId() {
        return id;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTimeInSec() {
        return timeInSec;
    }

    public void setTimeInSec(int time) {
        this.timeInSec = time;
    }

    public FormatAudio getFormatAudio() {
        return formatAudio;
    }

    public void setFormatAudio(FormatAudio format) {
        this.formatAudio = format;
    }
}
