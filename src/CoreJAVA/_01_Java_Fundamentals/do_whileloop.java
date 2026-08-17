package _01_Java_Fundamentals;


import java.util.Scanner;

public class do_whileloop {
    static void main() {
        int i =1;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter nth term till where you want to print");
        int n =in.nextInt();
        do{
            System.out.println(i);
            i++;
        }while (i<=n);
    }
}
