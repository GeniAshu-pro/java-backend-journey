package _01_Java_Fundamentals;


import java.util.Scanner;

public class main {
    static void main() {
//        System.out.println("enter your fav number");
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        System.out.println("your selected number is " + a);
//

//        System.out.println("wanna try some new boolean feature");
//        Scanner cs = new Scanner(System.in);
//        String b = cs.nextLine();
//        System.out.println("so wanna see what u have selected is stored in this variable b " +b);
//        System.out.println("what boolean do is take value like true and false ");
//        System.out.println("now you can enter whatever you whether it's true or false");
//        boolean c = cs.nextBoolean();
//        System.out.println("whatever u enter is now in c variable and that is " +c);

        System.out.println("heyy your result is out but it is in marks  ");
        System.out.println("wanna convert in percetage ");
        Scanner myboy = new Scanner(System.in);
        String a = myboy.nextLine();
        System.out.println("what ur marks in sub  1");
        int sub1 = myboy.nextInt();
        System.out.println("what ur marks in sub 2");
         int sub2 = myboy.nextInt();
        System.out.println("what ur marks in sub 3");
         int sub3 = myboy.nextInt();
        System.out.println("what ur marks in sub 4");
         int sub4 = myboy.nextInt();
        System.out.println("what ur marks in sub 5");
        int sub5 = myboy.nextInt();
        int total = sub1+sub2+sub3+sub4+sub5;
        System.out.println("what is the total mark for per subject :for eg 100 or 80 ");
        int total_marks = myboy.nextInt();
        float grand_Total = (total*100)/(5*total_marks);
        System.out.println("your calculated percentage is " + grand_Total + " % " );










    }

}

