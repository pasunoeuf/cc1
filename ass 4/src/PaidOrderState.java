public class PaidOrderState implements State {
    @Override
    public void payOrder(Order order) {
        System.out.println("Order is already paid.");
    }

    @Override
    public void shipOrder(Order order) {
        System.out.println("Order is shipped.");
        order.setState(new ShippedOrderState());
    }

    @Override
    public void deliverOrder(Order order) {
        System.out.println("Cannot deliver. Order must be shipped first.");
    }

    @Override
    public void cancelOrder(Order order) {
        System.out.println("Order is cancelled.");
        order.setState(new CancelledOrderState());
    }
}
