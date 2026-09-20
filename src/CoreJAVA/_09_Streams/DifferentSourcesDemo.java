package _09_Streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.nio.file.Files.*;

public class DifferentSourcesDemo {
    public static void main(String[] args) throws IOException {
//        Different Sources of Stream
//        1.From Collection
        List<Integer>number= Arrays.asList(1,2,3,4,5,6,7,8,9);
        Stream<Integer> integerStream=number.stream();
        integerStream.forEach(System.out::println);

//        2.From Array
        int [] numberArray={1,2,3,4,5,6,7,8,9};
        IntStream arrayStream=Arrays.stream(numberArray);
        arrayStream.forEach(System.out::println);

//        3.From Specific Values
        Stream<String>stringStream=Stream.of("a","b","c");
        stringStream.forEach(System.out::println);

//        4.From Files
       try(Stream<String>fileStream= Files.lines(Path.of("path"))){
          fileStream.forEach(System.out::println);
       }


//        5.Empty Stream
        Stream<String>emptyStream=Stream.empty();
    }
}
