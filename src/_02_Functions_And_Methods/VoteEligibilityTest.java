package _02_Functions_And_Methods;

import java.util.Scanner;

public class VoteEligibilityTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ur Current Age");
        int age =sc.nextInt();
        checkEligibility(age);
        if(checkEligibility(age)){
            System.out.println("eligible");
        }
        else {
            System.out.println("not eligible");
        }
        sc.close();
    }
    static Boolean checkEligibility (int Age){
        return Age >= 18;
    }
}
