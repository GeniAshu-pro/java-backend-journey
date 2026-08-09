package FunctionsandMethods;

import java.util.Scanner;

public class PythagoreanTriplet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number here !!: ");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();
        int max;
        int min1;
        int min2;
        if (number1 <= 0 || number2 <= 0 || number3 <= 0) {
            System.out.println(" Plz Enter valid number(Note: triplet Can't Contain Zero ");
            return;
        }
        // By using Math.max method
//    int max = Math.max(number1, Math.max(number2, number3));
//
//        int other1;
//        int other2;
//
//        if (max == number1) {
//            other1 = number2;
//            other2 = number3;
//        } else if (max == number2) {
//            other1 = number1;
//            other2 = number3;
//        } else {
//            other1 = number1;
//            other2 = number2;
//        }

        if (number1 > number2 && number1 > number3) {
            max = number1;
            min1 = number2;
            min2 = number3;
        } else if (number2 > number3) {
            max = number2;
            min1 = number1;
            min2 = number3;
        } else {
            max = number3;
            min1 = number1;
            min2 = number2;
        }
        if (checkPythagoreanTriplet(max, min1, min2)) {
            System.out.println("The given triplet is Pythagorean triplet");
        } else {
            System.out.println("The given triplet is Not a Pythagorean triplet");
        }
        sc.close();
    }

    static boolean checkPythagoreanTriplet(int a, int b, int c) {
        return a * a == b * b + c * c;
    }
}
