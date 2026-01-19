
package objectorientedprogramming.inheritance.level2;
// Hierarchical Inheritance: BankAccount → SavingsAccount, CheckingAccount, FixedDepositAccount
class BankAccount {
    String accountNumber;
    double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }

    public void displayAccountType() {
        System.out.println("Account Type: Basic Account");
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void displayAccountType() {
        System.out.println("Account Type: Savings Account");
        displayAccountInfo();
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("------------------------");
    }
}

class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    public void displayAccountType() {
        System.out.println("Account Type: Checking Account");
        displayAccountInfo();
        System.out.println("Withdrawal Limit: $" + withdrawalLimit);
        System.out.println("------------------------");
    }
}

class FixedDepositAccount extends BankAccount {
    int maturityPeriod; // in months

    public FixedDepositAccount(String accountNumber, double balance, int maturityPeriod) {
        super(accountNumber, balance);
        this.maturityPeriod = maturityPeriod;
    }

    @Override
    public void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
        displayAccountInfo();
        System.out.println("Maturity Period: " + maturityPeriod + " months");
        System.out.println("------------------------");
    }
}

public class BankAccountTypes {
    public static void main(String[] args) {
        System.out.println("=== Bank Account Types (Hierarchical Inheritance) ===\n");

        // Create different account types
        SavingsAccount savings = new SavingsAccount("SAV001", 10000, 3.5);
        CheckingAccount checking = new CheckingAccount("CHK001", 5000, 2000);
        FixedDepositAccount fd = new FixedDepositAccount("FD001", 50000, 12);

        // Display account types
        savings.displayAccountType();
        checking.displayAccountType();
        fd.displayAccountType();
    }
}
