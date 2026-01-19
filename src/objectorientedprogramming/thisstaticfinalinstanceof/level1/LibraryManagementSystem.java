
package objectorientedprogramming.thisstaticfinalinstanceof.level1;
class Book {
    // Static variable
    static String libraryName = "City Central Library";
    static int totalBooks = 0;

    // Instance variables
    String title;
    String author;
    final String isbn; // final - cannot be modified

    // Constructor using 'this'
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        totalBooks++;
    }

    // Static method
    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
        System.out.println("Total Books: " + totalBooks);
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Book Details:");
        System.out.println("Library: " + libraryName);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
        System.out.println("------------------------");
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        System.out.println("=== Library Management System ===\n");

        // Create book objects
        Book book1 = new Book("Java Programming", "James Gosling", "978-0134685991");
        Book book2 = new Book("Clean Code", "Robert Martin", "978-0132350884");
        Book book3 = new Book("Design Patterns", "Gang of Four", "978-0201633612");

        // Using instanceof to verify object type before displaying
        Object obj = book1;
        if (obj instanceof Book) {
            System.out.println("Object is an instance of Book");
            ((Book) obj).displayDetails();
        }

        book2.displayDetails();
        book3.displayDetails();

        // Display library name using static method
        Book.displayLibraryName();
    }
}
