package FunctionsandMethods;

import java.util.Scanner;

public class ReportCard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ur mark u got Out of 100");
        int marks = sc.nextInt();
        System.out.println("Here is ur Grade!!! " + displayGrade(marks));
        sc.close();
    }


    static String displayGrade(int marks) {
        if (marks < 0 || marks > 100) {
            return "Invalid Marks";
        }
        if (marks >= 91) return "AA";
        if (marks >= 81) return "AB";
        if (marks >= 71) return "BB";
        if (marks >= 61) return "BC";
        if (marks >= 51) return "CD";

        return "Fail";


    }
}


