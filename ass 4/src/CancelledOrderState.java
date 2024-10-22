public class CancelledOrderState implements State {
    @Override
    public void payOrder(Order order) {
        System.out.println("Order is cancelled. Cannot pay.");
    }

    @Override
    public void shipOrder(Order order) {
        System.out.println("Order is cancelled. Cannot ship.");
    }

    @Override
    public void deliverOrder(Order order) {
        System.out.println("Order is cancelled. Cannot deliver.");
    }

    @Override
    public void cancelOrder(Order order) {
        System.out.println("Order is already cancelled.");
    }
}
