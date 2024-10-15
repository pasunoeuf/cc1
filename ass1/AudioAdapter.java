public class AudioAdapter implements AudioPlayer {
    private AdvancedAudioPlayer advancedPlayer;

    public AudioAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("wav") || audioType.equalsIgnoreCase("aac")) {
            advancedPlayer = new AdvancedAudioPlayer();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("wav")) {
            advancedPlayer.playWAV(fileName);
        } else if (audioType.equalsIgnoreCase("aac")) {
            advancedPlayer.playAAC(fileName);
        }
    }
}
