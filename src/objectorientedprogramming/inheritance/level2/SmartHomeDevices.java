
package objectorientedprogramming.inheritance.level2;
// Single Inheritance: Device → Thermostat
class Device {
    String deviceId;
    String status;

    public Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    public void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + status);
    }
}

class Thermostat extends Device {
    int temperatureSetting;

    public Thermostat(String deviceId, String status, int temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    @Override
    public void displayStatus() {
        System.out.println("=== Smart Thermostat ===");
        super.displayStatus();
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
        System.out.println("------------------------");
    }

    public void adjustTemperature(int newTemp) {
        temperatureSetting = newTemp;
        System.out.println("Temperature adjusted to: " + temperatureSetting + "°C");
    }
}

public class SmartHomeDevices {
    public static void main(String[] args) {
        System.out.println("=== Smart Home Devices (Single Inheritance) ===\n");

        // Create thermostat objects
        Thermostat thermostat1 = new Thermostat("TH001", "Active", 22);
        Thermostat thermostat2 = new Thermostat("TH002", "Standby", 20);

        // Display status
        thermostat1.displayStatus();
        thermostat2.displayStatus();

        // Adjust temperature
        System.out.println();
        thermostat1.adjustTemperature(24);
        thermostat1.displayStatus();
    }
}
