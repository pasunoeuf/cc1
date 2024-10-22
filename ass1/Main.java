public class Main {
    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();


        cart.setPaymentStrategy(new CreditCardPayment("1234-5678-9012-3456"));
        cart.checkout(250.00);


        cart.setPaymentStrategy(new PayPalPayment("user@example.com"));
        cart.checkout(150.00);


        cart.setPaymentStrategy(new CryptoPayment("1A2B3C4D5E6F"));
        cart.checkout(500.00);
    }
}
