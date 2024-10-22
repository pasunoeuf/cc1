public class NewOrderState implements State {
    @Override
    public void payOrder(Order order) {
        System.out.println("Order is paid.");
        order.setState(new PaidOrderState());
    }

    @Override
    public void shipOrder(Order order) {
        System.out.println("Cannot ship the order. Payment is required.");
    }

    @Override
    public void deliverOrder(Order order) {
        System.out.println("Cannot deliver the order. Payment and shipping are required.");
    }

    @Override
    public void cancelOrder(Order order) {
        System.out.println("Order is cancelled.");
        order.setState(new CancelledOrderState());
    }
}
