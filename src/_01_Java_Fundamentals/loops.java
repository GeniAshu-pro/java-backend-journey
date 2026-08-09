package basic_point;

import java.util.Scanner;

public class loops {
    static void main() {
////        printing number from 1 to 5
//        for (int i=1;i<=5;i++ ){
//            System.out.println(+i);
//        }
//int a = 257;
//byte b =(byte)a;
//        System.out.println(b);
// While loop
//      int num = 1;
//      while(num<=5){
//          System.out.println("hello bro");
//           num++;
//      }

// do-while loop
//        int n=4;
//        do{
//            System.out.println("helllooooooo");
//            --n;
//        }
//        while(n>=0);

// finding the max number
//        int a;
//        int b;
//        int c;
//
//        Scanner in = new Scanner(System.in);
//        System.out.println("NOTE: PLZ dont enter same number each number should be different:");
//        System.out.println(" Enter number in a :");
//        a = in.nextInt();
//        System.out.println(" Enter number in b :");
//        b = in.nextInt();
//        System.out.println(" Enter number in c :");
//        c = in.nextInt();
//
//        int max = a;
//        if (b>max){
//            max=b;
//        }
//        if(c>max){
//            max = c;
//        }
//        System.out.println("The max number is "+max);

  // find the entered character is in uppercase or in lowercase:

//
//        Scanner sc =new Scanner(System.in);
//        char ch;
//        ch = sc.next().trim().charAt(0);
//
//        if(ch>='a' && ch<='z'){
//            System.out.println(" enter char is in lowercase");
//        }
//        else{
//            System.out.println("ohh it is in Uppercase");
//        }


    // fibonacci series:
//Scanner sc = new Scanner(System.in);
//int n = sc.nextInt();
//int a = 0;
//int b = 1;
//int count = 2;
//int temp;
//while(count<=n){
//     temp = b;
//     b=b+a;
//    a =temp;
//     count++;
//}
//System.out.println(b);

        //counting occurrences
//       Scanner sc=new Scanner(System.in);
//       long n =sc.nextLong();
//        System.out.println(n);
//       int count=0;
//       while(n>0){
//          long rem=n%10;
//           if(rem==3){
//               count++;
//           }
//           n=n/10;
//       }
//        System.out.println(count);

        //for loop(homework) counting occurrences :-
//        Scanner sc=new Scanner(System.in);
//        long n =sc.nextLong();
//
        // reverse the number
//        Scanner sc=new Scanner(System.in);
//        int n =sc.nextInt();
//        int ans=0;
//        while(n>0){
//          int rem=n%10;
//          ans=ans*10+rem;
//          n/=10;
//        }
//        System.out.println(ans);


//calculator progo for two number:

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the operator here !!: ");
        char op = sc.next().trim().charAt(0);
        System.out.println("Enter any Two number: ");
        while(true){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int ans=0;
            if(op=='*'|| op=='+'|| op=='%' || op=='/' || op=='-')
            {
                if (op == '*')
                {
                    ans = a * b;
                }
                if (op == '+')
                {
                    ans = a + b;
                }
                if (op == '-')
                {
                    ans = a - b;
                }
                if (op == '%')
                {
                    ans = a % b;
                }
                if (op == '/')
                {
                    if (b != 0)
                    {
                        ans = a / b;
                    }
                }
            } else if (op=='x' || op=='X')
            {
                break;
            }
            else{
                System.out.println(" Invalid operation!!! ,plz try again ");
            }

            System.out.println(ans);

        }







    }
}






