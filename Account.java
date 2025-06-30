

import java.util.ArrayList;

public class Account {
    protected String holderName;
    protected double balance;
    protected ArrayList<String> transactions;

    public Account(String holderName) {
        this.holderName = holderName;
        this.balance = 0.0;
        this.transactions = new ArrayList<>();
        transactions.add("Account created for " + holderName);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactions.add("Deposited: ₹" + amount);
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            transactions.add("Withdrew: ₹" + amount);
        } else {
            transactions.add("Failed Withdrawal: ₹" + amount);
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void printTransactionHistory() {
        System.out.println("\nTransaction History:");
        for (String t : transactions) {
            System.out.println(t);
        }
    }
}