public class DVDDevice implements Device {
    @Override
    public void powerOn() {
        System.out.println("DVD Player is now ON.");
    }

    @Override
    public void powerOff() {
        System.out.println("DVD Player is now OFF.");
    }

    @Override
    public void setChannel(int channel) {
        System.out.println("DVD Player does not support channels.");
    }

    @Override
    public void setVolume(int volume) {
        System.out.println("DVD Player volume set to: " + volume);
    }
}
