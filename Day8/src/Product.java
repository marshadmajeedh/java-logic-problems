public class Product {
    private final int id;
    private final String name;
    private double price;
    private boolean quantityAvailable;
    private int quantity;

    public Product(int id, String name, double price,int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        if (quantity > 0) {
            this.quantityAvailable = true;
        }
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean isQuantityAvailable() {
        return quantityAvailable;
    }

    public double getPrice() {
        return price;
    }

    public void printProductDetails() {
        System.out.println("Product ID: " + this.id);
        System.out.println("Product Name: " + this.name);
        System.out.println("Product Price: " + this.price);
        if (quantityAvailable) {
            System.out.println("Product Quantity: " + this.quantity);
        }
        System.out.println();
    }

}
