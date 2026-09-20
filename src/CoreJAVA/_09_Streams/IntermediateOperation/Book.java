package _09_Streams.IntermediateOperation;

public class Book {
    int publicationYear;
    String title;
    double price;
    String category;

    public Book(String category, double price, int publicationYear, String title) {
        this.category = category;
        this.price = price;
        this.publicationYear = publicationYear;
        this.title = title;

    }

    @Override
    public String toString() {
        return "Book{" +
                "category='" + category + '\'' +
                ", price=" + price +
                ", publicationYear=" + publicationYear +
                ", title='" + title + '\'' +
                '}';
    }
}
