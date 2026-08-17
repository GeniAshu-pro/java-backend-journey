package _04_OOPs._04_Abstraction;

public class SavingsAccount extends BankingAccount {

    public SavingsAccount(String accountNumber , double balance) {
        super(accountNumber,balance);
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("Withdrawn");
    }

    @Override
    public void deposit(double amount) {
        System.out.println("Deposited");
    }
}
