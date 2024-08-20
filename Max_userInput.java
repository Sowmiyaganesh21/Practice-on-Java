import java.util.Arrays;
import java.util.Scanner;

public class Max_userInput {
    public static int findNthMax(int[] arr, int n) {
        Arrays.sort(arr);
        return arr[arr.length - n];
    }

    public static int findNthMin(int[] arr, int n) {
        Arrays.sort(arr);
        return arr[n - 1];
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the values");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("THE FOLLOWING OPTIONS ARE SHOWN TO ENTER " );
        System.out.println("max-1st greatest number");
        System.out.println("max2-2nd greatest number");
        System.out.println("min-1st smallest number");
        System.out.println("min2-2nd smallest number");
        String choice = input.next();
        if (choice.equalsIgnoreCase("max")) {
            System.out.println(+ findNthMax(arr, 1));
        } else if (choice.equalsIgnoreCase("max2")) {
            System.out.println( + findNthMax(arr, 2));
        } else if (choice.equalsIgnoreCase("min")) {
            System.out.println(+ findNthMin(arr, 1));
        } else if (choice.equalsIgnoreCase("min2")) {
            System.out.println(+ findNthMin(arr, 2));
        } 
        else {
            System.out.println("Invalid choice!");
        }
        input.close();
    }
}