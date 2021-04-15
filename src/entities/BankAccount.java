package entities;

public class BankAccount {
    private String name;
    private int number;
    private double balance;

    public BankAccount(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public BankAccount(int number, String name, double initialDeposit) {
        this.number = number;
        this.name = name;
        deposit(initialDeposit);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount + 5.0;
    }

    public String toString() {
        return "Account "
                + number
                + ", Holder: "
                + name
                + ", Balance: $ "
                + String.format("%.2f", balance);
    }
}


