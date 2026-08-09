package _02_Functions_And_Methods;

import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 number one by one : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        max_Num(num1 ,num2 ,num3);
        min_Num(num1 , num2 , num3);

sc.close();
    }
     static void max_Num(int x , int y , int z  ){
  if(x>y & x>z){
      System.out.println("The maxNum among them is " +x)  ;
  } else if (y>z) {
      System.out.println("The maxNum among them is "+y);
  }else  {
      System.out.println("The maxNum among them is "+z);
  }
    }
    static void min_Num(int x , int y , int z){
        if(x<y & x<z){
            System.out.println("The minNum among them is " +x)  ;
        } else if (y<z) {
            System.out.println("The minNum among them is "+y);
        }else  {
            System.out.println("The minNum among them is "+z);
        }
    }
}
