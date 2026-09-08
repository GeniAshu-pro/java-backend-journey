package _08_MethodReferences;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class MethodReferencesDemo {
    public static void main(String[] args) {
        List<String>names = Arrays.asList("Alice","Charlie","Bob");

        //for loop
        for(int i = 0 ;i< names.size();i++){
            System.out.println(names.get(i));
        }

        //Enhanced Loop
        for(String name : names){
            System.out.println(name);
        }

        //for each
//        names.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String name) {
//                System.out.println(name);
//            }
//        });


// by using lambda express
//        names.forEach((name) ->System.out.println(name));


// by using method References :
        names.forEach(System.out::println);







    }
}
