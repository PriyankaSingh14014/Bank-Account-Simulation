public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String holderName) {
        super(holderName);
        this.interestRate = 0.03;
    }

    public SavingsAccount(String holderName, double interestRate) {
        super(holderName);
        this.interestRate = interestRate;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            transactions.add("Savings Withdrawal: ₹" + amount);
        } else {
            transactions.add("Savings Failed Withdrawal: ₹" + amount);
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public void addInterest() {
        double interest = balance * interestRate;
        balance += interest;
        transactions.add("Interest added: ₹" + interest);
    }
}