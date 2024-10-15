public class HomeEntertainmentSystem {
    public static void main(String[] args) {

        Device tv = new TVDevice();
        RemoteControl basicRemoteForTV = new BasicRemote(tv);
        basicRemoteForTV.powerButton();
        basicRemoteForTV.volumeButton(15);

        System.out.println();


        Device dvd = new DVDDevice();
        AdvancedRemote advancedRemoteForDVD = new AdvancedRemote(dvd);
        advancedRemoteForDVD.powerButton();
        advancedRemoteForDVD.volumeButton(10);

        System.out.println();


        Device soundSystem = new SoundSystemDevice();
        AdvancedRemote advancedRemoteForSound = new AdvancedRemote(soundSystem);
        advancedRemoteForSound.powerButton();
        advancedRemoteForSound.volumeButton(30);
    }
}
