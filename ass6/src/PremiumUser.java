public class PremiumUser extends User {
    public PremiumUser(ChatMediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println(name + " (Premium): Sending message -> " + message);
        mediator.sendMessage(message, this);
    }

    @Override
    public void receiveMessage(String message, String senderName) {
        System.out.println(name + " (Premium): Received from " + senderName + " -> " + message);
    }
}
