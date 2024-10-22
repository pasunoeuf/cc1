public class RemoteControl {
    private Command[] commands;
    private Command lastCommand;

    public RemoteControl() {
        commands = new Command[3]; // Three slots for commands
    }

    public void setCommand(int slot, Command command) {
        commands[slot] = command;
    }

    public void pressButton(int slot) {
        if (commands[slot] != null) {
            commands[slot].execute();
            lastCommand = commands[slot];
        } else {
            System.out.println("No command assigned to slot " + slot);
        }
    }

    public void pressUndo() {
        if (lastCommand != null) {
            lastCommand.undo();
        } else {
            System.out.println("Nothing to undo.");
        }
    }
}
