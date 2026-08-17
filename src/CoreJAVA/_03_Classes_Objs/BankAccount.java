package _03_Classes_Objs;

public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountHolderName, String accountNumber, double initialbalance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        if (initialbalance >= 0) {
            this.balance = initialbalance;
        } else {
            System.out.println("initial balance cannot be negative !!");
            this.balance = 0.0;
        }
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void deposit(double amount) {
        if (amount > 0) {
//            balance = getBalance()+amount;
            this.balance += amount;
            System.out.println("Succesfully Deposited !!! " + amount);
        } else {
            System.out.println("Plz Enter Valid Amount you wanna deposit");
        }
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
//            balance = getBalance() - amount;
            this.balance -= amount;
        } else if (amount <= 0) {
            System.out.println("Invalid !! withdrawal amount");
        } else {
            System.out.println("Insufficient balance !!!");
        }
    }
}
