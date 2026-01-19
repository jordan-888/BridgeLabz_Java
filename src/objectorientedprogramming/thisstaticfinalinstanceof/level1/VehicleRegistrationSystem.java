
package objectorientedprogramming.thisstaticfinalinstanceof.level1;
class Vehicle {
    // Static variable
    static double registrationFee = 150.0;
    static int totalVehicles = 0;

    // Instance variables
    String ownerName;
    String vehicleType;
    final String registrationNumber; // final - cannot be modified

    // Constructor using 'this'
    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
        totalVehicles++;
    }

    // Static method
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Registration fee updated to: $" + registrationFee);
    }

    // Method to display vehicle details
    public void displayDetails() {
        System.out.println("Vehicle Details:");
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Registration Fee: $" + registrationFee);
        System.out.println("------------------------");
    }
}

public class VehicleRegistrationSystem {
    public static void main(String[] args) {
        System.out.println("=== Vehicle Registration System ===\n");

        // Create vehicle objects
        Vehicle vehicle1 = new Vehicle("John Doe", "Car", "VEH001");
        Vehicle vehicle2 = new Vehicle("Jane Smith", "Motorcycle", "VEH002");
        Vehicle vehicle3 = new Vehicle("Bob Johnson", "Truck", "VEH003");

        // Check if object belongs to Vehicle class before displaying
        Object obj = vehicle1;
        if (obj instanceof Vehicle) {
            System.out.println("Object belongs to Vehicle class");
            ((Vehicle) obj).displayDetails();
        }

        vehicle2.displayDetails();
        vehicle3.displayDetails();

        // Update registration fee
        System.out.println();
        Vehicle.updateRegistrationFee(200.0);

        System.out.println("\nAfter fee update:");
        vehicle1.displayDetails();

        System.out.println("\nTotal Vehicles Registered: " + Vehicle.totalVehicles);
    }
}
