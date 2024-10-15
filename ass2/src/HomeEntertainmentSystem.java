public class HomeEntertainmentSystem {
    public static void main(String[] args) {
        // Control a TV with Basic Remote
        Device tv = new TVDevice();
        RemoteControl basicRemoteForTV = new BasicRemote(tv);
        basicRemoteForTV.powerButton();
        basicRemoteForTV.volumeButton(15);

        System.out.println();

        // Control a DVD Player with Advanced Remote
        Device dvd = new DVDDevice();
        AdvancedRemote advancedRemoteForDVD = new AdvancedRemote(dvd);
        advancedRemoteForDVD.powerButton();
        advancedRemoteForDVD.volumeButton(10);

        System.out.println();

        // Control a Sound System with Advanced Remote
        Device soundSystem = new SoundSystemDevice();
        AdvancedRemote advancedRemoteForSound = new AdvancedRemote(soundSystem);
        advancedRemoteForSound.powerButton();
        advancedRemoteForSound.volumeButton(30);
    }
}
