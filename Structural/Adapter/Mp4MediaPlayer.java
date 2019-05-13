package Structural.Adapter;

public class Mp4MediaPlayer implements NewMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        //do nothing.
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }
}
