package profiHomeWeek3.ex_ua;


import profiHomeWeek3.utils.NetUtils;

import java.io.IOException;
import java.net.URISyntaxException;

public class RunLoadClip {

    public static void main(String[] args) throws IOException, URISyntaxException {
        NetUtils.load("http://www.ex.ua/get/153568192", Constants.LOCAL_CLIP_PATH);
        NetUtils.load("http://www.ex.ua/get/89708257", Constants.LOCAL_AUDIO_PATH);
        NetUtils.load("http://www.ex.ua/get/89708135", Constants.LOCAL_PICTURE_PATH);
    }
}
