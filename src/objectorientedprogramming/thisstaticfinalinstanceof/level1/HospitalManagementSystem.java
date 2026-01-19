
package objectorientedprogramming.thisstaticfinalinstanceof.level1;
class Patient {
    // Static variable
    static String hospitalName = "City General Hospital";
    static int totalPatients = 0;

    // Instance variables
    String name;
    int age;
    String ailment;
    final int patientID; // final - cannot be modified

    // Constructor using 'this'
    public Patient(String name, int age, String ailment, int patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }

    // Static method
    public static void getTotalPatients() {
        System.out.println("Hospital Name: " + hospitalName);
        System.out.println("Total Patients: " + totalPatients);
    }

    // Method to display patient details
    public void displayDetails() {
        System.out.println("Patient Details:");
        System.out.println("Hospital: " + hospitalName);
        System.out.println("Patient ID: " + patientID);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Ailment: " + ailment);
        System.out.println("------------------------");
    }
}

public class HospitalManagementSystem {
    public static void main(String[] args) {
        System.out.println("=== Hospital Management System ===\n");

        // Create patient objects
        Patient patient1 = new Patient("Sarah Connor", 35, "Fever", 2001);
        Patient patient2 = new Patient("Michael Scott", 42, "Headache", 2002);
        Patient patient3 = new Patient("Pam Beesly", 28, "Cold", 2003);

        // Verify object type using instanceof before displaying
        Object obj = patient1;
        if (obj instanceof Patient) {
            System.out.println("Object is a valid Patient");
            ((Patient) obj).displayDetails();
        }

        patient2.displayDetails();
        patient3.displayDetails();

        // Display total patients using static method
        System.out.println();
        Patient.getTotalPatients();
    }
}
