import java.util.ArrayList;

class Product {
    private String productName;
    private double price;

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }
}

class Flipkart {
    private ArrayList<Product> products = new ArrayList<>();

    public void addProduct(String productName, double price) {
        products.add(new Product(productName, price));
        System.out.println("Product added: " + productName);
    }

    public void viewProducts() {
        System.out.println("Available products:");
        for (Product product : products) {
            System.out.println(product.getProductName() + " - $" + product.getPrice());
        }
    }

    public void placeOrder(String productName) {
        for (Product product : products) {
            if (product.getProductName().equalsIgnoreCase(productName)) {
                System.out.println("Order placed for: " + productName);
                return;
            }
        }
        System.out.println("Product not available.");
    }
}

