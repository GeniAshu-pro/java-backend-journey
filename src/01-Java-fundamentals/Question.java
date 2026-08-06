package basic_point;

import java.util.Scanner;

public class Question {
    static void main() {
        Scanner in = new Scanner(System.in);
//        System.out.println("Plz enter ur number here ");
//        int n =in.nextInt();
//        System.out.println(isArmstrong(n));
        for (int i=1000; i<10000 ;i++){
            if(isArmstrong(i)){
                System.out.println(i+ " ");
            }
        }


    }
    static boolean isArmstrong(int n){
        int original=n;
        int sum=0;
        while(n>0){
            int rem = n%10;
            n = n/10;
            sum=sum+rem*rem*rem*rem;
        }
       return sum==original;
    }
}