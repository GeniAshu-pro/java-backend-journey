package _06_ExceptionHandling;

class UnavailableBookException extends Exception {
    public UnavailableBookException(String message) {
        super(message);
    }
}

class Library {
    int availableBook = 3;

    public void borrowBook(int bookRequest) throws Exception {
        if (bookRequest > availableBook)
            throw new UnavailableBookException("Not Enough Book");
        if (bookRequest < 0)
            throw new Exception("At leat request 1 book");
    }
}

public class ExceptionThrowsDemo {
    public static void main(String[] args) {
        Library library = new Library();
        try {
            library.borrowBook(10);
        } catch (UnavailableBookException e) {
            e.printStackTrace();
        }catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error Occurred :" +e.getMessage());
        }
        finally {
            System.out.println("Finally block ");
        }

    }
}
