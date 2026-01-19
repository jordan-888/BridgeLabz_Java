
package objectorientedprogramming.classandobject.level2;
class BankAccount {
    String accountHolder;
    String accountNumber;
    double balance;

    // Constructor to initialize attributes
    public BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
            System.out.println("New Balance: $" + balance);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
            System.out.println("New Balance: $" + balance);
        } else if (amount > balance) {
            System.out.println("Insufficient balance! Current balance: $" + balance);
        } else {
            System.out.println("Invalid withdrawal amount!");
        }
    }

    // Method to display current balance
    public void displayBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: $" + balance);
        System.out.println("------------------------");
    }
}

public class ATMSystem {
    public static void main(String[] args) {
        // Create bank account object
        BankAccount account = new BankAccount("John Doe", "ACC123456", 1000.0);

        // Display initial balance
        account.displayBalance();

        // Perform ATM operations
        System.out.println("\n=== ATM Operations ===");
        account.deposit(500.0);
        System.out.println();

        account.withdraw(300.0);
        System.out.println();

        account.withdraw(1500.0); // Should fail - insufficient balance
        System.out.println();

        account.deposit(200.0);
        System.out.println();

        // Display final balance
        account.displayBalance();
    }
}
