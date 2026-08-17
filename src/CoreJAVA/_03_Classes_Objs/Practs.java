package _03_Classes_Objs;

public class Practs {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Ashutosh Pandey" , "1111111",50000);
        System.out.println("This is your Current Account Holder Name: "+account1.getAccountHolderName());
        System.out.println("This is your Current Balance: "+account1.getBalance());
        System.out.println("This is your Current Account Number: "+account1.getAccountNumber());

        account1.withdraw(20000);
        System.out.println("This is your Current Balance: "+account1.getBalance());
        account1.deposit(40000);
        System.out.println("This is your Current Balance: "+account1.getBalance());
        account1.withdraw(20000);
        System.out.println("This is your Current Balance: "+account1.getBalance());




    }
}
