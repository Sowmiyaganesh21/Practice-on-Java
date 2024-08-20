import java.util.Scanner;

public class odd_even{
        public static int[] rearrange(int[] items) {
        int n = items.length;
        int[] rearranged = new int[n];
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (items[i] % 2 == 0) {
                rearranged[index++] = items[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if (items[i] % 2 != 0) {
                rearranged[index++] = items[i];
            }
        }
        return rearranged;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] items = new int[n];
        for (int i = 0; i < n; i++) {
            items[i] = input.nextInt();
        }
        input.close();
        int[] arranges=new int[n];
        for (int item : arranges) {
            System.out.print(item + " ");
        }
    }
}
