package basic_point;

import java.util.Scanner;
import java.util.Random;


public class Game1 {
    static void main() {
        int i=1;
        Scanner in = new Scanner(System.in);
       while(true) {

           System.out.println("Instruction to play game ROCK PAPER SCISSORS !!!");
           System.out.println("TO choose 1) ROCK ENTER number 'r' ");
           System.out.println("TO choose 2) PAPER ENTER number 'p' ");
           System.out.println("TO choose 3) SCISSORS ENTER number 's' ");
           char you = in.next().charAt(0);
           Random rand = new Random();
           String option = "rps";
           char opponent = option.charAt(rand.nextInt(3));
           System.out.println("Opponent did: "+opponent);
           if(you==opponent){
               System.out.println("TIE , try again!!!!!");
           }

           if((you=='r'&& opponent=='p') || (you=='p'&& opponent=='s') || (you=='s'&& opponent=='r')){
               System.out.println("YOU LOSE:(");
           }
           if((you=='p'&& opponent=='r') || (you=='s'&& opponent=='p') || (you=='r'&& opponent=='s')){
               System.out.println("YOU WIN !!!!!!");
               i++;
               System.out.println("wanna play again?(y/n): ");
               if (in.next().toLowerCase().charAt(0) !='y') break;
           }
       }

       in.close();


    }}