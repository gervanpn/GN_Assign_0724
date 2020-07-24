import java.awt.desktop.SystemEventListener;

public class Book {
    private String book_name;
    private String isbn;
    private String author;
    private String publisher;

    public Book(String book, String id, String name, String house) {
        book_name = book;
        isbn = id;
        author = name;
        publisher = house;
    }

    public String getBook_name() {
        return book_name;
    }
    public String getIsbn() {
        return isbn;
    }
    public String getAuthor() {
        return author;
    }
    public String getPublisher() {
        return publisher;
    }

    public void setBook_name(String book_name1) {
        book_name = book_name1;
    }
    public void setIsbn(String isbn1) {
        isbn = isbn1;
    }
    public void setAuthor(String author1) {
        author = author1;
    }
    public void setPublisher(String publisher1) {
        publisher = publisher1;
    }

    public void getBookInfo() {
        System.out.println(book_name + " by " + author + "- published by " + publisher + "(" + isbn + ")");
    }
}
