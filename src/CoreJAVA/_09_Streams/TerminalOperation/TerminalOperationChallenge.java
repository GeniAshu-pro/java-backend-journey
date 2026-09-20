package _09_Streams.TerminalOperation;

import _09_Streams.IntermediateOperation.Book;

import java.util.Arrays;
import java.util.List;

public class TerminalOperationChallenge {
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book("Fiction", 499.0, 2020, "The Silent Patient"),
                new Book("Technology", 799.0, 2023, "Clean Code"),
                new Book("Fiction", 350.0, 2019, "The Alchemist"),
                new Book("Science", 650.0, 2021, "A Brief History of Time"),
                new Book("Technology", 999.0, 2024, "Effective Java"),
                new Book("History", 450.0, 2018, "Sapiens")
        );
//        Total cost of all books in the bookstore
//        Collecting books into a List of titles
//        Grouping books by category
    }
}
