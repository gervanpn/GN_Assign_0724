import java.util.Scanner;

public class BookTest {
    public static void main (String[] args) {
        Book[] book = new Book[30];
        int i=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("How many books to enter (max 30):");
        int n = sc.nextInt();
        for (i = 0; i < n; i++) {
            System.out.printf("\nEnter book Details: \n"  ,i+1);
            book[i] = new Book();
            book[i].getBook_name();
            book[i].getIsbn();
            book[i].getAuthor();
            book[i].getPublisher();
        }

        for(i = 0; i < n; i++)
        {
            book[i].getBookInfo();
            System.out.println();
        }

    }


}
