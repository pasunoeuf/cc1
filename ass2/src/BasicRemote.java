public class BasicRemote extends RemoteControl {
    public BasicRemote(Device device) {
        super(device);
    }

    @Override
    public void powerButton() {
        System.out.println("Basic Remote: Toggling power.");
        device.powerOn();
        device.powerOff();
    }

    @Override
    public void volumeButton(int volume) {
        System.out.println("Basic Remote: Setting volume.");
        device.setVolume(volume);
    }
}
