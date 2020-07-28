import java.util.*;

public class DisplayArrays {
    public static void main(String args[]) {

        String[] names = {"Lisa", "Michael", "Ashley", "Jacob", "Emily"};
        int[] ages = {49, 48, 26, 19, 16};
        displayArrays(names, ages);
    }

    public static void displayArrays(String[] names, int[] ages) {
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + " is " + ages[i] + " years old.");
        }
    }
}