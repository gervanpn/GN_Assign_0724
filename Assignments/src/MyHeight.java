import java.util.Scanner;

public class MyHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How tall are you ?");
        System.out.println("Enter feet only:");
        double tf = sc.nextDouble();
        System.out.println("Enter inches only:");
        double ti = sc.nextDouble();
        double inch = 2.54;
        howTall(tf, ti, inch);
    }

    public static void howTall(double tf, double ti, double inch) {
        double inCm = (((tf * 12)*inch)+(ti*inch));
        System.out.println(tf + " feet, " + ti + " inches is = " + inCm + " CM tall.");
    }
}
