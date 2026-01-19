
package objectorientedprogramming.constructorsinstancevsclassaccessmodifiers.level1;
class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double dailyRate;

    // Constructor to initialize rental details
    public CarRental(String customerName, String carModel, int rentalDays, double dailyRate) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.dailyRate = dailyRate;
    }

    // Method to calculate total rental cost
    public double calculateTotalCost() {
        return rentalDays * dailyRate;
    }

    // Method to display rental details and total cost
    public void displayRentalDetails() {
        System.out.println("Car Rental Details:");
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Daily Rate: $" + dailyRate);
        System.out.println("Total Cost: $" + calculateTotalCost());
        System.out.println("------------------------");
    }
}

public class CarRentalSystem {
    public static void main(String[] args) {
        // Create car rental objects
        CarRental rental1 = new CarRental("John Smith", "Toyota Camry", 5, 50.0);
        CarRental rental2 = new CarRental("Sarah Johnson", "Honda Accord", 3, 45.0);
        CarRental rental3 = new CarRental("Mike Brown", "Tesla Model 3", 7, 120.0);

        // Display rental details
        rental1.displayRentalDetails();
        rental2.displayRentalDetails();
        rental3.displayRentalDetails();
    }
}
