import java.util.Scanner;

public class myBubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int n = sc.nextInt();
        System.out.println("Enter array numbers (any order): ");
        int[] usersArray = new int[n];
        for (int i = 0; i < n; i++) {
            usersArray[i] = sc.nextInt();
        }
        count(n);
        myNumbers(usersArray);
        bSort(usersArray);
        newNumbers(usersArray);
    }

    public static void myNumbers(int [] usersArray) {
        System.out.println("Array Values as Entered: ");
        for(int i=0; i < usersArray.length; i++){
            System.out.print(usersArray[i] + " ");
        }
        System.out.println();
    }

    public static void count(int n1) {
        System.out.println("Array length: " + n1);
    }

    public static void bSort(int [] userArray) {
        int n = userArray.length;
        int temp = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(userArray[j-1] > userArray[j]){
                    //swap elements
                    temp = userArray[j-1];
                    userArray[j-1] = userArray[j];
                    userArray[j] = temp;
                }
            }
        }
    }

    public static void newNumbers(int [] usersArray) {
        System.out.println("Array Values after Bubble sort: ");
        for(int i=0; i < usersArray.length; i++){
            System.out.print(usersArray[i] + " ");
        }
        System.out.println();
    }
}
