
package objectorientedprogramming.constructorsinstancevsclassaccessmodifiers.level2;
class Product {
    // Instance variables
    String productName;
    double price;

    // Class variable (static)
    static int totalProducts = 0;

    // Constructor
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++; // Increment total products count
    }

    // Instance method to display product details
    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: $" + price);
        System.out.println("------------------------");
    }

    // Class method to display total number of products
    public static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
        System.out.println("========================");
    }
}

public class ProductInventory {
    public static void main(String[] args) {
        System.out.println("=== Product Inventory System ===\n");

        // Display initial count
        Product.displayTotalProducts();

        // Create product objects
        Product product1 = new Product("Laptop", 899.99);
        Product product2 = new Product("Mouse", 25.50);
        Product product3 = new Product("Keyboard", 75.00);

        // Display product details
        System.out.println("\nProduct Details:");
        product1.displayProductDetails();
        product2.displayProductDetails();
        product3.displayProductDetails();

        // Display total products
        System.out.println();
        Product.displayTotalProducts();
    }
}
