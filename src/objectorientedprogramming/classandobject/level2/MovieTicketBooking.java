
package objectorientedprogramming.classandobject.level2;
class MovieTicket {
    String movieName;
    String seatNumber;
    double price;
    boolean isBooked;

    // Constructor to initialize movie name
    public MovieTicket(String movieName) {
        this.movieName = movieName;
        this.seatNumber = "";
        this.price = 0.0;
        this.isBooked = false;
    }

    // Method to book ticket
    public void bookTicket(String seatNumber, double price) {
        if (!isBooked) {
            this.seatNumber = seatNumber;
            this.price = price;
            this.isBooked = true;
            System.out.println("Ticket booked successfully!");
        } else {
            System.out.println("Ticket already booked!");
        }
    }

    // Method to display ticket details
    public void displayTicketDetails() {
        System.out.println("Movie Ticket Details:");
        System.out.println("Movie Name: " + movieName);
        if (isBooked) {
            System.out.println("Seat Number: " + seatNumber);
            System.out.println("Price: $" + price);
            System.out.println("Status: BOOKED");
        } else {
            System.out.println("Status: NOT BOOKED");
        }
        System.out.println("------------------------");
    }
}

public class MovieTicketBooking {
    public static void main(String[] args) {
        // Create movie ticket objects
        MovieTicket ticket1 = new MovieTicket("Avengers: Endgame");
        MovieTicket ticket2 = new MovieTicket("The Dark Knight");
        MovieTicket ticket3 = new MovieTicket("Inception");

        // Display initial status
        ticket1.displayTicketDetails();

        // Book tickets
        ticket1.bookTicket("A12", 15.99);
        ticket2.bookTicket("B05", 12.50);
        ticket3.bookTicket("C20", 14.00);

        // Display booked ticket details
        System.out.println("\n=== Booked Tickets ===");
        ticket1.displayTicketDetails();
        ticket2.displayTicketDetails();
        ticket3.displayTicketDetails();

        // Try to book already booked ticket
        System.out.println("\n=== Attempting to Re-book ===");
        ticket1.bookTicket("A13", 15.99);
    }
}
