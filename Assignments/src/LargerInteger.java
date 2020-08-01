import java.util.*;

public class LargerInteger {
    static  String lgr = "Is Larger";
    static  String eql = "These numbers are Equal";

    public static void main(String args[]) {
        String answer;

        Scanner sc= new Scanner(System.in);  // Number 3
        System.out.println("Enter 1st number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd number: ");
        int num2 = sc.nextInt();

        if (num1 == num2) {
            answer = eql;
            System.out.println(num1 + " " + answer);
        } else {
            if (num1 > num2) {
                answer = lgr;
                System.out.println(num1 + " " + answer);
            } else {
                answer = lgr;
                System.out.println(num2 + " " + answer);
            }
        }
    }
}
