public class Main {
    public static void main(String[] args) {

        TV tv = new TV();
        Stereo stereo = new Stereo();
        Light light = new Light();


        Command tvOnCommand = new TurnTVOn(tv);
        Command setVolumeCommand = new SetVolume(stereo, 10);
        Command dimLightsCommand = new DimLights(light, 50);


        RemoteControl remote = new RemoteControl();
        remote.setCommand(0, tvOnCommand);
        remote.setCommand(1, setVolumeCommand);
        remote.setCommand(2, dimLightsCommand);


        System.out.println("Executing commands:");
        remote.pressButton(0); // Turn TV On
        remote.pressButton(1); // Set Stereo Volume
        remote.pressButton(2); // Dim Lights


        System.out.println("\nUndoing last command:");
        remote.pressUndo();
    }
}
