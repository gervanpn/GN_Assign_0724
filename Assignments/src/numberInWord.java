import java.util.*;

public class numberInWord {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number 0 to 9: ");
        int num = sc.nextInt();
        PrintNumIf(num);
        System.out.println("your number : "+ num + " is " + PrintNumIf(num));
        PrintNumCase(num);
        System.out.println("for number "+ num + " is " + PrintNumCase(num));

    }

        public static String PrintNumIf(int num) { // Option a
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
                return "NOT 0-9";   //returns if no case is matched
        }

    public static String PrintNumCase(int num) {  // Option b
        switch(num) {
            case 1 :
                return "One";
            case 2:
                return "Two";
            case 3:
                return "Three";
            case 4:
                return "Four";
            case 5:
                return "Five";
            case 6:
                return "Six";
            case 7:
                return "Seven";
            case 8:
                return "Eight";
            case 9:
                return "Nine";
            case 0:
                return "Zero";
            default :
                return "Other than 0-9";
        }
    }
}
