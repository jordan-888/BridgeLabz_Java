
package objectorientedprogramming.classandobject.level2;
class CartItem {
    String itemName;
    double price;
    int quantity;

    // Constructor to initialize attributes
    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Method to add quantity to the cart
    public void addItem(int additionalQuantity) {
        if (additionalQuantity > 0) {
            quantity += additionalQuantity;
            System.out.println("Added " + additionalQuantity + " " + itemName + "(s) to cart");
            System.out.println("New quantity: " + quantity);
        } else {
            System.out.println("Invalid quantity!");
        }
    }

    // Method to remove quantity from the cart
    public void removeItem(int removeQuantity) {
        if (removeQuantity > 0 && removeQuantity <= quantity) {
            quantity -= removeQuantity;
            System.out.println("Removed " + removeQuantity + " " + itemName + "(s) from cart");
            System.out.println("Remaining quantity: " + quantity);
        } else if (removeQuantity > quantity) {
            System.out.println("Cannot remove " + removeQuantity + " items. Only " + quantity + " in cart!");
        } else {
            System.out.println("Invalid quantity!");
        }
    }

    // Method to calculate total cost
    public double calculateTotalCost() {
        return price * quantity;
    }

    // Method to display item details
    public void displayDetails() {
        System.out.println("Item: " + itemName);
        System.out.println("Price per unit: $" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: $" + calculateTotalCost());
        System.out.println("------------------------");
    }
}

public class ShoppingCart {
    public static void main(String[] args) {
        // Create cart items
        CartItem item1 = new CartItem("Laptop", 899.99, 1);
        CartItem item2 = new CartItem("Mouse", 25.50, 2);
        CartItem item3 = new CartItem("Keyboard", 75.00, 1);

        // Display initial cart
        System.out.println("=== Initial Cart ===");
        item1.displayDetails();
        item2.displayDetails();
        item3.displayDetails();

        // Perform cart operations
        System.out.println("\n=== Cart Operations ===");
        item1.addItem(1);
        System.out.println();

        item2.addItem(3);
        System.out.println();

        item3.removeItem(1);
        System.out.println();

        item2.removeItem(2);
        System.out.println();

        // Display updated cart
        System.out.println("\n=== Updated Cart ===");
        item1.displayDetails();
        item2.displayDetails();
        item3.displayDetails();

        // Display total cart value
        double totalCartValue = item1.calculateTotalCost() + item2.calculateTotalCost() + item3.calculateTotalCost();
        System.out.println("Total Cart Value: $" + totalCartValue);
    }
}
