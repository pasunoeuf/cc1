public class MusicPlayerApp {
    public static void main(String[] args) {
        AudioPlayer mp3Player = new MP3Player();

        mp3Player.play("mp3", "song1.mp3");

        AudioPlayer wavAdapter = new AudioAdapter("wav");
        wavAdapter.play("wav", "song2.wav");

        AudioPlayer aacAdapter = new AudioAdapter("aac");
        aacAdapter.play("aac", "song3.aac");

        mp3Player.play("ogg", "song4.ogg");
    }
}
