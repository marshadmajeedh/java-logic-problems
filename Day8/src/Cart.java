import java.util.ArrayList;

public class Cart {
    ArrayList<Product> products;

    public Cart() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {

        if (product.isQuantityAvailable()) {
            products.add(product);
        }
        else {
            System.out.println("Product is not available");
            System.out.println();
        }

    }

    public double calculateTotal(int index,double sum) {

        if (index == products.size()) {
            return sum;
        }

        if (products.get(index).isQuantityAvailable()) {
            sum += products.get(index).getQuantity() * products.get(index).getPrice();
        }

        return calculateTotal(index + 1, sum);

    }

    public void printCartDetails() {
        for (Product product : products) {
            product.printProductDetails();
        }
    }

    public Product returnProductByID(int id,int index) {
        if (index < 0) {
            System.out.println ("Product is not available");
            return null;
        }

        if (products.get(index).getId() == id) {
            return products.get(index);
        }

        return returnProductByID(id, index -1);
    }

    public Product returnProductByName(String name,int index) {
        if (index < 0) {
            System.out.println ("Product is not available");
            return null;
        }
        if(products.get(index).getName().equalsIgnoreCase(name)) {
            return products.get(index);
        }

        return returnProductByName(name, index -1);
    }

    public int getSize() {
        return products.size() - 1;
    }
}
