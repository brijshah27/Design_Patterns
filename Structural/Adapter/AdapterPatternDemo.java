package Structural.Adapter;

public class AdapterPatternDemo {

    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.playCD("mp3", "cold play");
        audioPlayer.playCD("mp4", "nothing holding me back");
        audioPlayer.playCD("vlc", "something just like this");
        audioPlayer.playCD("mp3", "east side");
    }
}
