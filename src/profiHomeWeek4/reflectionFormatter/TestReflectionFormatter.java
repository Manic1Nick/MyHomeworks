package profiHomeWeek4.reflectionFormatter;

public class TestReflectionFormatter {

    public static void main(String[] args) {

        AudioRecord audioFile = new AudioRecord("Toy Dolls", "Nellie The Elephant", 180, FormatAudio.MP3);

        ReflectionFormatter rf = new ReflectionFormatter();

        String audioJson = rf.objectToJson(audioFile);
        System.out.println(audioJson);

        AudioRecord audioObj = (AudioRecord) rf.jsonToObject(audioJson);
        System.out.println(audioObj.getArtist() + "\n" +
                audioObj.getName() + "\n" +
                audioObj.getTimeInSec() + "\n" +
                audioObj.getFormatAudio());

    }
}
