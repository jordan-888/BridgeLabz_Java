
package objectorientedprogramming.inheritance.level2;
// Hybrid Inheritance using Interface
class Vehicle {
    int maxSpeed;
    String model;

    public Vehicle(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    public void displayVehicleInfo() {
        System.out.println("Model: " + model);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
}

interface Refuelable {
    void refuel();
}

class ElectricVehicle extends Vehicle {
    int batteryCapacity; // in kWh

    public ElectricVehicle(int maxSpeed, String model, int batteryCapacity) {
        super(maxSpeed, model);
        this.batteryCapacity = batteryCapacity;
    }

    public void charge() {
        System.out.println("=== Electric Vehicle ===");
        displayVehicleInfo();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
        System.out.println("Charging the electric vehicle...");
        System.out.println("------------------------");
    }
}

class PetrolVehicle extends Vehicle implements Refuelable {
    int fuelTankCapacity; // in liters

    public PetrolVehicle(int maxSpeed, String model, int fuelTankCapacity) {
        super(maxSpeed, model);
        this.fuelTankCapacity = fuelTankCapacity;
    }

    @Override
    public void refuel() {
        System.out.println("=== Petrol Vehicle ===");
        displayVehicleInfo();
        System.out.println("Fuel Tank Capacity: " + fuelTankCapacity + " liters");
        System.out.println("Refueling the petrol vehicle...");
        System.out.println("------------------------");
    }
}

public class VehicleManagementSystem {
    public static void main(String[] args) {
        System.out.println("=== Vehicle Management System (Hybrid Inheritance) ===\n");

        // Create vehicles
        ElectricVehicle ev = new ElectricVehicle(200, "Tesla Model 3", 75);
        PetrolVehicle pv = new PetrolVehicle(180, "Honda Civic", 50);

        // Demonstrate behaviors
        ev.charge();
        pv.refuel();

        // Demonstrate interface polymorphism
        System.out.println("=== Refuelable Vehicles ===");
        Refuelable refuelableVehicle = pv;
        refuelableVehicle.refuel();
    }
}
