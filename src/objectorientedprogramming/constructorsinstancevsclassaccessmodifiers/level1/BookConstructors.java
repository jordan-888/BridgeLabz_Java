
package objectorientedprogramming.constructorsinstancevsclassaccessmodifiers.level1;
class Book {
    String title;
    String author;
    double price;

    // Default constructor
    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }

    // Parameterized constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Book Details:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("------------------------");
    }
}

public class BookConstructors {
    public static void main(String[] args) {
        // Using default constructor
        Book book1 = new Book();
        System.out.println("Book created with default constructor:");
        book1.displayDetails();

        // Using parameterized constructor
        Book book2 = new Book("Java Programming", "James Gosling", 45.99);
        Book book3 = new Book("Clean Code", "Robert Martin", 39.99);

        System.out.println("Books created with parameterized constructor:");
        book2.displayDetails();
        book3.displayDetails();
    }
}
