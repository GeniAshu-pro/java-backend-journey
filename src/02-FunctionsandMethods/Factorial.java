package FunctionsandMethods;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number here: ");
        int num = sc.nextInt();
        int factorial = getFactorial(num);
        if (factorial <0){
            System.out.println("Invalid input");
        }else {
            System.out.println("The factorial of " + num + " is: " + factorial);
        }
    }

    static int getFactorial(int n) {
        if (n < 0) {
            return -1;
        }
        if (n == 0) {
            return 1;
        }
        int i;
        int fact = 1;
        for (i = n; i >= 1; i--) {
            fact = fact * i;
        }
        return fact;
    }
}
