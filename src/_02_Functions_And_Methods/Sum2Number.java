package _02_Functions_And_Methods;

import java.util.Scanner;

public class Sum2Number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number U wanna perform sum Operation ");
        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();
        System.out.println("The Sum of ur 2 Number is : " + sum(firstNumber, secondNumber));
        sc.close();


    }

    static int sum(int a, int b) {
        return (a + b);
    }

}
