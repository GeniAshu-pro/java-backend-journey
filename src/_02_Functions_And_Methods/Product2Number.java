package _02_Functions_And_Methods;

import java.util.Scanner;

public class Product2Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number U wanna perform Product Operation ");
        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();
        System.out.println("The Product of ur 2 Number is : " + Product(firstNumber, secondNumber));
        sc.close();


    }

    static int Product(int a, int b) {
        return (a * b);
    }

}


