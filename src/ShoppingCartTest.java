public class ShoppingCartTest {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        Item item1 = new Item("1234", 100);
        Item item2 = new Item("5443",400);
        cart.addItem(item1);
        cart.addItem(item2);
        cart.pay(new PaypalStrategy("shofique2024@gmail.com","mypass"));
        cart.pay(new CreditCardStrategy("shofique","456680989080","657","11/25"));
    }
}