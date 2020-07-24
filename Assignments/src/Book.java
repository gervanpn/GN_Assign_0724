import java.util.Scanner;

public class Book {
    private String book_name;
    private String isbn;
    private String author;
    private String publisher;

    public Book() {
        book_name = "Java";
        isbn = "1020";
        author = "Oreilly";
        publisher = "Clearinghouse";
    }
    Scanner scan = new Scanner(System.in);
    public String getBook_name() {
        System.out.println("Book Name: ");
        book_name = scan.next();
        return book_name;
    }
    public String getIsbn() {
        System.out.println("ISBN Number: ");
        isbn = scan.next();
        return isbn;
    }
    public String getAuthor() {
        System.out.println("Author: ");
        author = scan.next();
        return author;
    }
    public String getPublisher() {
        System.out.println("Publisher: ");
        publisher = scan.next();
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
        System.out.println(book_name + " written by " + author + " - published by " + publisher + " (" + isbn + ")");
    }

}
