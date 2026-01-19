
package objectorientedprogramming.constructorsinstancevsclassaccessmodifiers.level2;
class Vehicle {
    // Instance variables
    String ownerName;
    String vehicleType;

    // Class variable (static)
    static double registrationFee = 150.0;

    // Constructor
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method to display vehicle details
    public void displayVehicleDetails() {
        System.out.println("Vehicle Details:");
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: $" + registrationFee);
        System.out.println("------------------------");
    }

    // Class method to update registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Registration fee updated to: $" + registrationFee);
        System.out.println("========================");
    }
}

public class VehicleRegistrationSystem {
    public static void main(String[] args) {
        System.out.println("=== Vehicle Registration System ===\n");

        // Create vehicle objects
        Vehicle vehicle1 = new Vehicle("John Doe", "Car");
        Vehicle vehicle2 = new Vehicle("Jane Smith", "Motorcycle");
        Vehicle vehicle3 = new Vehicle("Bob Johnson", "Truck");

        // Display vehicle details
        vehicle1.displayVehicleDetails();
        vehicle2.displayVehicleDetails();
        vehicle3.displayVehicleDetails();

        // Update registration fee using class method
        System.out.println();
        Vehicle.updateRegistrationFee(200.0);

        // Display vehicle details again to show updated fee
        System.out.println("\nAfter updating registration fee:");
        vehicle1.displayVehicleDetails();
        vehicle2.displayVehicleDetails();
    }
}
