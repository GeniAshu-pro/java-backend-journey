package _09_Streams;




import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class FirstStreamDemo {

//    if u see to filter out we need a some condition for filtering by using predicate we implement that
    static Predicate<Integer>p=new Predicate<Integer>() {
        @Override
        public boolean test(Integer integer) {
            int remainder=integer%2;
            if(remainder==0)
                return true;
            return false;
        }
    };
    public static void main(String[] args) {
        List<Integer>numbers= Arrays.asList(1,2,3,4,5,6,7,8,9);

//        Iteration 1:list even Number from numbers list without using Stream
        List<Integer>evenNumber=new ArrayList<>();
        for(int num:numbers){
        if(num%2==0)
            evenNumber.add(num);
        }
        System.out.println("here ur list of even Number: "+evenNumber);

//        Iteration 2:with help of streams
        Stream<Integer> integerStream1=numbers.stream();
        Stream<Integer>integerStream2=integerStream1.filter(p);
        List<Integer>evenNumber2=integerStream2.toList();
        System.out.println("Here ur list of even Number: "+evenNumber2);


    }
}
