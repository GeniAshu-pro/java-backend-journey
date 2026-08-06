package basic_point;

import java.sql.SQLOutput;
import java.util.Scanner;

public class assignment {
    static void main() {
        // factorial
       Scanner in=new Scanner(System.in);
        System.out.println("Enter the number");
       int n =in.nextInt();
       int i ;
       int fact=0;
       int temp=1;
       int num=0;
       for(i=1;i<=n;i++){
       fact=n;
       temp=temp*(fact-num);
       num++;
       }
        System.out.println(temp);











    }
}
