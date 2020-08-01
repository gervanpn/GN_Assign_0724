import java.util.*;

public class CheckOddEven {
    static  String odd = "Odd Number";
    static  String even = "Even Number";
    static  String bye = "Goodbye";

    public static void main(String args[]) {
        String answer;

        Scanner sc= new Scanner(System.in);  // Number 1
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        if (num % 2 == 0)
            answer = even;
        else
            answer = odd;

        System.out.println(answer);
        System.out.println(bye);
    }

}
