import java.util.Scanner;

public class DateTest {
    public static void main (String[] args) {
        Date date1 = new Date(1, 1, 2020);
        myDate(date1);
    }

        private static void myDate(Date date1) {
            Scanner sn = new Scanner(System.in);

            System.out.println("Enter Day: ");
            date1.setDay(sn.nextInt());
            System.out.println("Enter Month: ");
            date1.setMonth(sn.nextInt());
            System.out.println("Enter Year: ");
            date1.setYear(sn.nextInt());

            date1.displayDate1();
    }
}
