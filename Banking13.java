package method;

import java.util.ArrayList;
import java.util.List;

// Account.java
interface Account {
    void deposit(double amount);
    void withdraw(double amount);
    double calculateInterest();
    double viewBalance();
}

// SavingsAccount.java
class SavingsAccount implements Account {
    private double balance;
    private double interestRate;

    public SavingsAccount(double initialBalance, double interestRate) {
        this.balance = initialBalance;
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " to Savings Account. New balance: " + balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " from Savings Account. New balance: " + balance);
        } else {
            System.out.println("Insufficient funds in Savings Account.");
        }
    }

    @Override
    public double calculateInterest() {
        return balance * interestRate / 100;
    }

    @Override
    public double viewBalance() {
        return balance;
    }

    public void addInterest() {
        double interest = calculateInterest();
        balance += interest;
        System.out.println("Added interest " + interest + " to Savings Account. New balance: " + balance);
    }
}

// CurrentAccount.java
class CurrentAccount implements Account {
    private double balance;
    private double overdraftLimit;

    public CurrentAccount(double initialBalance, double overdraftLimit) {
        this.balance = initialBalance;
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " to Current Account. New balance: " + balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " from Current Account. New balance: " + balance);
        } else {
            System.out.println("Exceeded overdraft limit in Current Account.");
        }
    }

    @Override
    public double calculateInterest() {
        return 0; // Current accounts typically do not earn interest
    }

    @Override
    public double viewBalance() {
        return balance;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
        System.out.println("Set overdraft limit to " + overdraftLimit + " in Current Account.");
    }
}

// Bank.java
class Bank {
    private List<Account> accounts;

    public Bank() {
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
        System.out.println("Added new account. Total accounts: " + accounts.size());
    }

    public void showAllBalances() {
        for (Account account : accounts) {
            System.out.println("Account balance: " + account.viewBalance());
        }
    }
}

// Main.java
public class Banking13 {
    public static void main(String[] args) {
        Bank bank = new Bank();

        SavingsAccount savingsAccount = new SavingsAccount(1000, 5);
        CurrentAccount currentAccount = new CurrentAccount(500, 200);

        bank.addAccount(savingsAccount);
        bank.addAccount(currentAccount);

        savingsAccount.deposit(200);
        savingsAccount.addInterest();
        savingsAccount.withdraw(100);

        currentAccount.deposit(300);
        currentAccount.withdraw(700);
        currentAccount.setOverdraftLimit(300);
        currentAccount.withdraw(100);

        bank.showAllBalances();
    }
}
