
package objectorientedprogramming.objectmodellingclassdiagram.level1;
import java.util.ArrayList;

class Bank {
    String bankName;
    ArrayList<Customer> customers;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.customers = new ArrayList<>();
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
        System.out.println("Customer " + customer.name + " added to " + bankName);
    }

    public void openAccount(Customer customer, double initialBalance) {
        customer.balance = initialBalance;
        System.out.println("Account opened for " + customer.name + " with balance: $" + initialBalance);
    }

    public void displayCustomers() {
        System.out.println("\n" + bankName + " - Customers:");
        System.out.println("========================");
        for (Customer customer : customers) {
            System.out.println("Customer: " + customer.name + ", Balance: $" + customer.balance);
        }
    }
}

class Customer {
    String name;
    String customerId;
    double balance;
    Bank associatedBank;

    public Customer(String name, String customerId, Bank bank) {
        this.name = name;
        this.customerId = customerId;
        this.balance = 0.0;
        this.associatedBank = bank;
    }

    public void viewBalance() {
        System.out.println("Customer: " + name);
        System.out.println("Bank: " + associatedBank.bankName);
        System.out.println("Balance: $" + balance);
        System.out.println("------------------------");
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited $" + amount + " to " + name + "'s account");
    }
}

public class BankAssociation {
    public static void main(String[] args) {
        System.out.println("=== Bank and Account Holders (Association) ===\n");

        // Create Bank
        Bank bank = new Bank("Global Bank");

        // Create Customers associated with Bank
        Customer customer1 = new Customer("John Doe", "C001", bank);
        Customer customer2 = new Customer("Jane Smith", "C002", bank);
        Customer customer3 = new Customer("Bob Johnson", "C003", bank);

        // Add customers to bank
        bank.addCustomer(customer1);
        bank.addCustomer(customer2);
        bank.addCustomer(customer3);

        // Open accounts
        System.out.println();
        bank.openAccount(customer1, 5000.0);
        bank.openAccount(customer2, 7500.0);
        bank.openAccount(customer3, 3000.0);

        // Customers view their balance
        System.out.println("\nCustomer Balance Views:");
        customer1.viewBalance();
        customer2.viewBalance();

        // Perform transactions
        System.out.println("\nTransactions:");
        customer1.deposit(1000.0);
        customer2.deposit(500.0);

        // Display all customers
        bank.displayCustomers();
    }
}
