
package objectorientedprogramming.objectmodellingclassdiagram.level1;
import java.util.ArrayList;

class Book {
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void displayDetails() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}

class Library {
    String libraryName;
    ArrayList<Book> books;

    public Library(String libraryName) {
        this.libraryName = libraryName;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added to " + libraryName);
    }

    public void displayBooks() {
        System.out.println("\n" + libraryName + " - Books:");
        System.out.println("========================");
        for (Book book : books) {
            book.displayDetails();
        }
    }
}

public class LibraryAggregation {
    public static void main(String[] args) {
        System.out.println("=== Library and Books (Aggregation) ===\n");

        // Create Book objects independently
        Book book1 = new Book("Java Programming", "James Gosling");
        Book book2 = new Book("Clean Code", "Robert Martin");
        Book book3 = new Book("Design Patterns", "Gang of Four");

        // Create Library objects
        Library library1 = new Library("Central Library");
        Library library2 = new Library("University Library");

        // Add books to libraries (Aggregation - books can exist independently)
        library1.addBook(book1);
        library1.addBook(book2);
        library1.addBook(book3);

        library2.addBook(book1); // Same book can be in multiple libraries
        library2.addBook(book3);

        // Display library contents
        library1.displayBooks();
        library2.displayBooks();

        // Books still exist even if library reference is removed
        System.out.println("\nBooks exist independently:");
        book1.displayDetails();
        book2.displayDetails();
    }
}
