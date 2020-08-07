import java.util.*;

public class numberInWord {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number 1 to 9: ");
        int num = sc.nextInt();
        PrintNumIf(num);
        System.out.println("your number : "+ num + " is " + PrintNumIf(num));
    }

        public static String PrintNumIf(int num) {
            if(num == 1)
                return "ONE" ;
            else if(num == 2)
                return "TWO";
            else if(num == 3)
                return "THREE";
            else if(num == 4)
                return "FOUR";
            else if(num == 5)
                return "FIVE";
            else if(num == 6)
                return "SIX";
            else if(num == 7)
                return "SEVEN";
            else if(num == 8)
                return "EIGHT";
            else if(num == 9)
                return "NINE";
            else if(num == 0)
                return "ZERO";
            else
                return "Other";   //returns if no case is matched
        }
}
