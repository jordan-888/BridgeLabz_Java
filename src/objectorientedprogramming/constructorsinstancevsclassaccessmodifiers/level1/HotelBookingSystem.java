
package objectorientedprogramming.constructorsinstancevsclassaccessmodifiers.level1;
class HotelBooking {
    String guestName;
    String roomType;
    int nights;

    // Default constructor
    public HotelBooking() {
        this.guestName = "Guest";
        this.roomType = "Standard";
        this.nights = 1;
    }

    // Parameterized constructor
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy constructor
    public HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

    // Method to display booking information
    public void displayBookingInfo() {
        System.out.println("Hotel Booking Information:");
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Number of Nights: " + nights);
        System.out.println("------------------------");
    }
}

public class HotelBookingSystem {
    public static void main(String[] args) {
        // Using default constructor
        HotelBooking booking1 = new HotelBooking();
        System.out.println("Booking created with default constructor:");
        booking1.displayBookingInfo();

        // Using parameterized constructor
        HotelBooking booking2 = new HotelBooking("Alice Johnson", "Deluxe", 3);
        System.out.println("Booking created with parameterized constructor:");
        booking2.displayBookingInfo();

        // Using copy constructor
        HotelBooking booking3 = new HotelBooking(booking2);
        System.out.println("Booking created with copy constructor:");
        booking3.displayBookingInfo();
    }
}
