package Abstraction;

public class AbstractionDemo {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount( "11232ab" ,129);
        savingsAccount.deposit(100);
         BankingAccount savingsAccount1 = new SavingsAccount("123213ff" ,123);
       savingsAccount1 = new CurrentAccount("232e2daj",123);
       savingsAccount1.deposit(200);
       savingsAccount1 = new SavingsAccount("123sdbsa" , 3300);
       System.out.println(savingsAccount1.getAccountNumber());
        System.out.println(savingsAccount1.getAccountNumber());
    }
}
