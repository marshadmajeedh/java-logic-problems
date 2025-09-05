public class Customer {
    private final int id;
    private final String name;
    private Cart cart;

    public Customer(int id, String name, Cart cart) {
        this.id = id;
        this.name = name;
        this.cart = cart;
    }

    public void checkout() {
        System.out.println ("Customer ID : "+id);
        System.out.println ("Customer Name : "+name);
        System.out.println ();
        System.out.println ("Customer Cart Details : ");
        cart.printCartDetails();
        double totalPrice = cart.calculateTotal(0,0);

        if (totalPrice > 10000) {
            double discount = 0.1* totalPrice;
            totalPrice -= discount;
            System.out.println ("Total price with discount 10% : "+totalPrice);

        } else {
            System.out.println ("Total price : "+totalPrice);
        }
    }
}
