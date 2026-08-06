package Abstraction;

public class CurrentAccount extends BankingAccount {
    public CurrentAccount(String accountNumber , double balance) {
        super(accountNumber,balance);
    }


    @Override
    public void withdraw(double amount) {
        System.out.println(" Withdrawn Current ");
    }

    @Override
    public void deposit(double amount) {
        System.out.println("Deposited Current ");
    }
}
