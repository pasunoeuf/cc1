public class RegularUser extends User {
    public RegularUser(ChatMediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println(name + " (Regular): Sending message -> " + message);
        mediator.sendMessage(message, this);
    }

    @Override
    public void receiveMessage(String message, String senderName) {
        System.out.println(name + " (Regular): Received from " + senderName + " -> " + message);
    }
}
