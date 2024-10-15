public class AdvancedRemote extends RemoteControl {
    public AdvancedRemote(Device device) {
        super(device);
    }

    @Override
    public void powerButton() {
        System.out.println("Advanced Remote: Toggling power.");
        device.powerOn();
        device.powerOff();
    }

    @Override
    public void volumeButton(int volume) {
        System.out.println("Advanced Remote: Setting volume.");
        device.setVolume(volume);
    }

    public void setChannelButton(int channel) {
        System.out.println("Advanced Remote: Setting channel.");
        device.setChannel(channel);
    }
}
