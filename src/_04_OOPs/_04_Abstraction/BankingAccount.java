package Abstraction;

 abstract public class BankingAccount {
    private String accountNumber;
    private double balance;

     public BankingAccount(String accountNumber, double balance) {
         this.accountNumber = accountNumber;
         this.balance = balance;
     }

     public String getAccountNumber() {
         return accountNumber;
     }

     public double getBalance() {
         return balance;
     }

     public void setBalance(double balance) {
         this.balance = balance;
     }

     public void setAccountNumber(String accountNumber) {
         this.accountNumber = accountNumber;
     }

     public abstract  void withdraw(double amount );
      public abstract  void deposit(double amount);


 }
