package _10_Optionals;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        Optional<String>optionalString = Optional.of("Ashutosh");
        Optional<String>optionalString1 = Optional.empty();
        Optional<String>optionalString2 = Optional.ofNullable(null);
        System.out.println(optionalString);
        System.out.println(optionalString1);
        System.out.println(optionalString2);

        //Checking Values
        //isPresent
        System.out.println("Demo of isPresent():");
        System.out.println(optionalString.isPresent());
        System.out.println(optionalString1.isPresent());
        System.out.println(optionalString2.isPresent());
        //isEmpty
        System.out.println("Demo of isEmpty():");
        System.out.println(optionalString.isEmpty());
        System.out.println(optionalString1.isEmpty());
        System.out.println(optionalString2.isEmpty());

        // get() variation
        //get()
        System.out.println("By Using get():");
        System.out.println(optionalString.get());
//        System.out.println(optionalString2.get());

        //orElse()
        System.out.println("By Using orElse():");
        System.out.println(optionalString.orElse("default"));
        System.out.println(optionalString2.orElse("default"));
        System.out.println(optionalString2.orElse(null));

        //orElseGet
        System.out.println("By Using orElseGet():");
      String result = optionalString.orElseGet(()->{
          return "default";
              });
      System.out.println(result);
        String result1= optionalString2.orElseGet(()-> "default!!!!");
        System.out.println(result1);

        //orElseThrow
//        System.out.println("By Using orElseThrow():");
//        String newResult = optionalString2.orElseThrow(()->new RuntimeException("Not found"));
//        System.out.println(newResult);

        //Combined Operation
        System.out.println("here All operation is Combined in Shorthand form:");
       optionalString.filter(n->n.startsWith("A"))
               .map(String::toUpperCase)
               .ifPresent(System.out::println);






    }
}
