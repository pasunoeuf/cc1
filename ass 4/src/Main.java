public class Main {
    public static void main(String[] args) {
        Order order = new Order();

        System.out.println("Scenario 1: Successful order processing");
        order.payOrder();
        order.shipOrder();
        order.deliverOrder();

        System.out.println("\nScenario 2: Attempting invalid actions");
        order.payOrder();
        order.cancelOrder();

        System.out.println("\nScenario 3: Cancel an order before shipping");
        Order newOrder = new Order();
        newOrder.cancelOrder();
    }
}
