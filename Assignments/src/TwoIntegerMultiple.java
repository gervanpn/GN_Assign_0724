import java.util.*;
public class TwoIntegerMultiple {

    static  String is = "Is a multiple of";
    static  String not = "Is not a multiple of";
    int num1, num2;

    public static void main(String args[]) {
        String answer;

        Scanner sc= new Scanner(System.in);  // Number 3
        System.out.println("Enter 1st number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd number: ");
        int num2 = sc.nextInt();

        boolean multiple = isMultiple(num1, num2);

        if (multiple == true) {
            answer = is;
            System.out.println(num2 + " " + answer + " " + num1);
        } else {
            answer = not;
            System.out.println(num2 + " " + answer + " " + num1);
        }
    }

    public static boolean isMultiple(int num1, int num2) {
        int remainder = num1 % num2;
        boolean multiple;
        if (remainder != 0) {
            multiple = false;
        } else {
            multiple = true;
        }
        return multiple;
    }
}
