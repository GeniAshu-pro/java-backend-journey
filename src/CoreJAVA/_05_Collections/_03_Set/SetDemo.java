package _05_Collections._03_Set;

import java.util.HashSet;
import java.util.Set;

public class SetDemo  {
    public static void main(String[] args) {
        Set<String> uses =new HashSet<>();
        uses.add("Ashutosh");
        uses.add("Ashutosh"); // doesn't Contain Duplicates
        uses.add("Harsh");
        for(String user:uses){
            System.out.println(uses);
        }



    }
}
