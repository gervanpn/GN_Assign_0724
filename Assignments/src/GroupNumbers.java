import java.util.*;

public class GroupNumbers {
    public static void main(String [] args){
        int length;
        int last;
        int lrg;
        ArrayList<Integer> list=new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers to enter: ");
        int nums = sc.nextInt();
        for (int i = 0; i < nums; i++) {
            System.out.println("Enter a number: ");
            int val = sc.nextInt();
            list.add(val);
        }

        length = list.size();
        System.out.println("You Entered "+ list);

        counter(length);  // item 'A' done

        last = (list.get(length-1));
        lastNum(last);    // item 'B' done

        lrg = getMax(list);
        largest(lrg);
    }

    public static void counter(int length) {
        System.out.println("You entered " + length + " numbers");  //item 'A' print
    }

    public static void lastNum(int last) {
        System.out.println("The last number entered was: " + last);  //item 'B' print
    }

    public static void largest(int lrg) {
        System.out.println("The largest number entered was: " + lrg);  //item 'C' print
    }

    public static int getMax(ArrayList<Integer> list) {
        int maximum = list.get(0);
        for(int i=1; i < list.size(); i++) {
            if (list.get(i) > maximum) {
                maximum = list.get(i);
            }
        }
        return maximum;
    }
}