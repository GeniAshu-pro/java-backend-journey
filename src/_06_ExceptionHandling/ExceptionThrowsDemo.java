package _06_ExceptionHandling;

class Library {
    int availableBook = 3;

    public void borrowBook(int bookRequest) throws Exception {
        if (bookRequest > availableBook)
            throw new Exception("Not enough book is available");

    }
}

public class ExceptionThrowsDemo {
    public static void main(String[] args) {
        Library library = new Library();
        try {
            library.borrowBook(1);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
