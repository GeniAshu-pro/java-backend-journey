package _09_Streams.IntermediateOperation;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class IntermediateDemo {
    static Predicate<Book> predicate = new Predicate<Book>() {
        @Override
        public boolean test(Book book) {
            return book.price < 500;

        }
    };

    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book("Fiction", 499.0, 2020, "The Silent Patient"),
                new Book("Technology", 799.0, 2023, "Clean Code"),
                new Book("Fiction", 350.0, 2019, "The Alchemist"),
                new Book("Science", 650.0, 2021, "A Brief History of Time"),
                new Book("Technology", 999.0, 2024, "Effective Java"),
                new Book("History", 450.0, 2018, "Sapiens")
        );

//    1.Filtering : Books Cheaper  than 500

        Stream<Book> filteredBook = books.stream()
                .filter(book -> book.price < 500);
        filteredBook.forEach(System.out::println);

//        Stream<Book> stream1 =books.stream();
//        Stream<Book>stream2=stream1.filter(predicate);
//        stream2.forEach(System.out::println);

//        2.Mapping:Convert book titles to uppercase
        Stream<String> upperCaseTitles = books.stream()
                .map(book -> book.title.toUpperCase());
        upperCaseTitles.forEach(System.out::println);

//        3.Sorting: Books by publication date
        Stream<Book> sortedBooks = books.stream()
                .sorted(Comparator.comparingInt(book -> book.publicationYear));
        sortedBooks.forEach(System.out::println);

//        4.Distinct : Remove duplicate titles

        Stream<Book>uniqueBooks=books.stream().distinct();
        uniqueBooks.forEach(System.out::println);

//        5.Limit: Display only the First 3 books
        System.out.println("DISPLAY FIRST 3 PUBLISHED BOOK BY PUBLICATION YEAR");
        Stream<Book>firstThreeBooks=books.stream()
                .sorted(Comparator.comparingInt(book -> book.publicationYear))
                .limit(3);
        firstThreeBooks.forEach(System.out::println);

//     6.Skip: Skip the first 2 books
        System.out.println("DISPLAY AFTER SKIPPING TWO");
        Stream<Book>afterSkippingTwo=books.stream()
                .skip(2);
        afterSkippingTwo.forEach(System.out::println);






    }
}








