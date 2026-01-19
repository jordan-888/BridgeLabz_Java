
package objectorientedprogramming.inheritance.level1;
class Vehicle {
    int maxSpeed;
    String fuelType;

    public Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    public void displayInfo() {
        System.out.println("Max Speed: " + maxSpeed + " km/h");
        System.out.println("Fuel Type: " + fuelType);
    }
}

class Car extends Vehicle {
    int seatCapacity;

    public Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    @Override
    public void displayInfo() {
        System.out.println("\n=== Car ===");
        super.displayInfo();
        System.out.println("Seat Capacity: " + seatCapacity);
    }
}

class Truck extends Vehicle {
    int loadCapacity; // in tons

    public Truck(int maxSpeed, String fuelType, int loadCapacity) {
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void displayInfo() {
        System.out.println("\n=== Truck ===");
        super.displayInfo();
        System.out.println("Load Capacity: " + loadCapacity + " tons");
    }
}

class Motorcycle extends Vehicle {
    boolean hasSideCar;

    public Motorcycle(int maxSpeed, String fuelType, boolean hasSideCar) {
        super(maxSpeed, fuelType);
        this.hasSideCar = hasSideCar;
    }

    @Override
    public void displayInfo() {
        System.out.println("\n=== Motorcycle ===");
        super.displayInfo();
        System.out.println("Has Side Car: " + (hasSideCar ? "Yes" : "No"));
    }
}

public class VehicleTransportSystem {
    public static void main(String[] args) {
        System.out.println("=== Vehicle and Transport System (Polymorphism) ===");

        // Create vehicle objects
        Car car = new Car(180, "Petrol", 5);
        Truck truck = new Truck(120, "Diesel", 10);
        Motorcycle motorcycle = new Motorcycle(150, "Petrol", false);

        // Store in Vehicle array (polymorphism)
        Vehicle[] vehicles = { car, truck, motorcycle };

        // Call displayInfo() to demonstrate runtime polymorphism
        System.out.println("\nDemonstrating Polymorphism:");
        for (Vehicle vehicle : vehicles) {
            vehicle.displayInfo();
        }
    }
}
