package JavaCollectionsStreams.generics;

import java.util.ArrayList;
import java.util.List;

// Category interfaces
interface Category {
    String getCategoryName();
}

class BookCategory implements Category {
    @Override
    public String getCategoryName() {
        return "Books";
    }
}

class ClothingCategory implements Category {
    @Override
    public String getCategoryName() {
        return "Clothing";
    }
}

class GadgetCategory implements Category {
    @Override
    public String getCategoryName() {
        return "Gadgets";
    }
}

// Generic Product class with bounded type parameter
class Product<T extends Category> {
    private int productId;
    private String productName;
    private double price;
    private T category;

    public Product(int productId, String productName, double price, T category) {
        this.productId = productId;
        this.price = price;
        this.productName = productName;
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void displayProduct() {
        System.out.println("Product ID: " + productId +
                ", Name: " + productName +
                ", Category: " + category.getCategoryName() +
                ", Price: $" + String.format("%.2f", price));
    }
}

// Product Catalog with generic methods
class ProductCatalog {
    private List<Product<? extends Category>> products = new ArrayList<>();

    // Generic method to add products
    public <T extends Category> void addProduct(Product<T> product) {
        products.add(product);
    }

    // Generic method to apply discount with bounded type parameter
    public <T extends Category> void applyDiscount(Product<T> product, double percentage) {
        if (percentage < 0 || percentage > 100) {
            System.out.println("Invalid discount percentage!");
            return;
        }
        double discountAmount = product.getPrice() * (percentage / 100);
        double newPrice = product.getPrice() - discountAmount;
        product.setPrice(newPrice);
        System.out.println("Applied " + percentage + "% discount. New price: $" +
                String.format("%.2f", newPrice));
    }

    // Generic method to apply discount to multiple products
    public <T extends Category> void applyBulkDiscount(List<Product<T>> productList, double percentage) {
        System.out.println("\nApplying " + percentage + "% bulk discount...");
        for (Product<T> product : productList) {
            applyDiscount(product, percentage);
        }
    }

    public void displayAllProducts() {
        System.out.println("\n=== Product Catalog ===");
        for (Product<? extends Category> product : products) {
            product.displayProduct();
        }
    }
}

public class OnlineMarketplace {
    public static void main(String[] args) {
        System.out.println("=== Dynamic Online Marketplace ===\n");

        ProductCatalog catalog = new ProductCatalog();

        // Creating products with different categories
        Product<BookCategory> book1 = new Product<>(101, "Java Programming", 45.99, new BookCategory());
        Product<BookCategory> book2 = new Product<>(102, "Data Structures", 55.00, new BookCategory());

        Product<ClothingCategory> clothing1 = new Product<>(201, "T-Shirt", 19.99, new ClothingCategory());
        Product<ClothingCategory> clothing2 = new Product<>(202, "Jeans", 49.99, new ClothingCategory());

        Product<GadgetCategory> gadget1 = new Product<>(301, "Wireless Mouse", 25.50, new GadgetCategory());
        Product<GadgetCategory> gadget2 = new Product<>(302, "USB-C Hub", 35.00, new GadgetCategory());

        // Adding products to catalog
        catalog.addProduct(book1);
        catalog.addProduct(book2);
        catalog.addProduct(clothing1);
        catalog.addProduct(clothing2);
        catalog.addProduct(gadget1);
        catalog.addProduct(gadget2);

        catalog.displayAllProducts();

        // Applying individual discounts
        System.out.println("\n--- Applying Individual Discounts ---");
        catalog.applyDiscount(book1, 10);
        catalog.applyDiscount(gadget1, 15);

        // Applying bulk discount to clothing items
        List<Product<ClothingCategory>> clothingItems = new ArrayList<>();
        clothingItems.add(clothing1);
        clothingItems.add(clothing2);
        catalog.applyBulkDiscount(clothingItems, 20);

        catalog.displayAllProducts();

        // Demonstrating type safety
        System.out.println("\n--- Type Safety Demonstration ---");
        System.out.println("✓ Type-safe: Only valid category types can be used");
        System.out.println("✓ Generic methods ensure discount applies to correct product types");
        System.out.println("✓ Bounded type parameters restrict to Category subtypes only");
    }
}
