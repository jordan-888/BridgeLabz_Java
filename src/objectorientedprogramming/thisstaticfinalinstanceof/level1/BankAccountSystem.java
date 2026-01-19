
package objectorientedprogramming.thisstaticfinalinstanceof.level1;
class BankAccount {
    // Static variable
    static String bankName = "Global Bank";
    static int totalAccounts = 0;

    // Instance variables
    String accountHolderName;
    final String accountNumber; // final - cannot be modified
    double balance;

    // Constructor using 'this'
    public BankAccount(String accountHolderName, String accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        totalAccounts++;
    }

    // Static method
    public static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
        System.out.println("Bank Name: " + bankName);
    }

    // Method to display account details
    public void displayDetails() {
        System.out.println("Account Details:");
        System.out.println("Bank: " + bankName);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
        System.out.println("------------------------");
    }
}

public class BankAccountSystem {
    public static void main(String[] args) {
        System.out.println("=== Bank Account System ===\n");

        // Create bank account objects
        BankAccount account1 = new BankAccount("John Doe", "ACC001", 5000.0);
        BankAccount account2 = new BankAccount("Jane Smith", "ACC002", 7500.0);
        BankAccount account3 = new BankAccount("Bob Johnson", "ACC003", 3000.0);

        // Using instanceof to check object type before displaying
        Object obj = account1;
        if (obj instanceof BankAccount) {
            System.out.println("Object is an instance of BankAccount");
            ((BankAccount) obj).displayDetails();
        }

        account2.displayDetails();
        account3.displayDetails();

        // Display total accounts using static method
        BankAccount.getTotalAccounts();
    }
}
