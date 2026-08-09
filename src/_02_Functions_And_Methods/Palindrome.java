package _02_Functions_And_Methods;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
       int reversedNumber = reverse(number);
      if(number == reversedNumber){
          System.out.println("Yes it is palindrome");
      }
      else {
          System.out.println("it's not a palindrome number");
      }
      sc.close();
    }

    static int reverse(int number) {
        int reverse = 0 ;
        while (number != 0){
            int digit = number %10;
            reverse = reverse*10+digit;
            number = number/10;
        }
        return reverse;
    }
}


