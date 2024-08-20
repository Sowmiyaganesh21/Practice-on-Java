import java.util.Scanner;

public class Adjust_distance {
    public static int distance(int[] items) {
        int sum = 0;
        for (int i = 0; i < items.length - 1; i++) {
            sum += Math.abs(items[i] - items[i + 1]);
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] items = new int[n];
        for (int i = 0; i < n; i++) {
            items[i] = input.nextInt();
        }
        input.close();

        System.out.println(distance(items));
    }
}
