import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input
        int numProducts = scanner.nextInt();
        int targetDiscount = scanner.nextInt();
        int[] customers = new int[numProducts];
        for (int i = 0; i < numProducts; i++) {
            customers[i] = scanner.nextInt();
        }

        // Count the occurrences of the target discount
        int count = 0;
        for (int numCustomers : customers) {
            if (numCustomers == targetDiscount) {
                count++;
            }
        }

        // Print the result
        System.out.println(count);

        scanner.close();
    }
}