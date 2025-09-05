import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product(1,"Biscuit",100,10);
        Product product2 = new Product(2,"Rice",300,0);
        Product product3 = new Product(3,"Kottu",400,30);

        Cart cart = new Cart();
        cart.addProduct(product1);
        cart.addProduct(product2);
        cart.addProduct(product3);

        Customer customer = new Customer(1,"Marshad",cart);

        System.out.println("\nFind product by it's ID : "+cart.returnProductByID(2, cart.getSize()));

        Product findProduct1 = cart.returnProductByID(1, cart.getSize());
        System.out.println("\nFind product by it's ID : ");
        findProduct1.printProductDetails();

        System.out.println("\nFind product by it's name : "+cart.returnProductByID(2, cart.getSize()));

        Product findProduct2 = cart.returnProductByName("Biscuit",cart.getSize());
        System.out.println("\nFind product by it's name : ");
        findProduct2.printProductDetails();

        customer.checkout();


    }
}
