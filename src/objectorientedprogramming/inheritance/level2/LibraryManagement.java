
package objectorientedprogramming.inheritance.level2;
// Single Inheritance: Book → Author
class Book {
    String title;
    int publicationYear;

    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    public void displayBookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
    }
}

class Author extends Book {
    String name;
    String bio;

    public Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    public void displayInfo() {
        System.out.println("=== Book and Author Information ===");
        displayBookInfo();
        System.out.println("Author: " + name);
        System.out.println("Bio: " + bio);
        System.out.println("------------------------");
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        System.out.println("=== Library Management (Single Inheritance) ===\n");

        // Create Author objects (which extend Book)
        Author author1 = new Author("Effective Java", 2018, "Joshua Bloch",
                "Software engineer and author");
        Author author2 = new Author("Clean Code", 2008, "Robert Martin",
                "Software consultant and author");

        // Display information
        author1.displayInfo();
        author2.displayInfo();
    }
}
