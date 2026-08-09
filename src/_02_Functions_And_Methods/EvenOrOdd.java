package FunctionsandMethods;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number here : ");
        int num = sc.nextInt();
        evenOddNum(num);
        sc.close();
    }

    static void evenOddNum(int a){
        if(a%2==0){
            System.out.println("The given number is Even");
        }
        else
            System.out.println("The given number is Odd");
    }
}
