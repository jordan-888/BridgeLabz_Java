
package objectorientedprogramming.thisstaticfinalinstanceof.level1;
class Product {
    // Static variable
    static double discount = 10.0; // 10% discount
    static int totalProducts = 0;

    // Instance variables
    String productName;
    final String productID; // final - cannot be modified
    double price;
    int quantity;

    // Constructor using 'this'
    public Product(String productName, String productID, double price, int quantity) {
        this.productName = productName;
        this.productID = productID;
        this.price = price;
        this.quantity = quantity;
        totalProducts++;
    }

    // Static method
    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
        System.out.println("Discount updated to: " + discount + "%");
    }

    // Method to calculate final price after discount
    public double calculateFinalPrice() {
        return price * quantity * (1 - discount / 100);
    }

    // Method to display product details
    public void displayDetails() {
        System.out.println("Product Details:");
        System.out.println("Product ID: " + productID);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: $" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Final Price: $" + String.format("%.2f", calculateFinalPrice()));
        System.out.println("------------------------");
    }
}

public class ShoppingCartSystem {
    public static void main(String[] args) {
        System.out.println("=== Shopping Cart System ===\n");

        // Create product objects
        Product product1 = new Product("Laptop", "P001", 899.99, 1);
        Product product2 = new Product("Mouse", "P002", 25.50, 2);
        Product product3 = new Product("Keyboard", "P003", 75.00, 1);

        // Validate object type using instanceof before processing
        Object obj = product1;
        if (obj instanceof Product) {
            System.out.println("Object is a valid Product");
            ((Product) obj).displayDetails();
        }

        product2.displayDetails();
        product3.displayDetails();

        // Update discount
        System.out.println();
        Product.updateDiscount(15.0);

        System.out.println("\nAfter discount update:");
        product1.displayDetails();
    }
}
