package basic_point;

import java.util.Scanner;

public class coditional {
    static void main() {
//        int age = 18;
//        if (age > 18) {
//            System.out.println("yes BOYYY you are 18 now go for party use protection");
//        }
//        else {
//            System.out.println("yeah boy wait till you turn 18 till now use ur hand ");
//        }
        System.out.println("Bro plz enter ur age");
        Scanner sc=new Scanner(System.in);
        int age = sc.nextInt();
        if(age>=56){
            System.out.println("You are experienced bro");
        }
        else if (age>=36) {
            System.out.println("You are semi-experienced bro");
        }
        else if (age>=26) {
            System.out.println("You are semi-semi experinced bro");
        }
        else {
            System.out.println("Bro you need to work to get experinced because you are not experinced");
        }

    }

}
