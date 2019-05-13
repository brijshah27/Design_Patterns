package Structural.Adapter;

public class MediaAdapter implements OldMediaPlayer {
    NewMediaPlayer newMediaPlayer;

   public MediaAdapter(String type){
       if(type == "vlc"){
           newMediaPlayer = new VlcMediaPlayer();
       }
       else {
           newMediaPlayer = new Mp4MediaPlayer();
       }

   }

    @Override
    public void playCD(String audioType, String fileName) {
       if(audioType == "vlc"){
           newMediaPlayer.playVlc(fileName);
       }
       else {
           newMediaPlayer.playMp4(fileName);
       }
    }
}
