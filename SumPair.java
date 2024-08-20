import java.util.Arrays;

public class SumPair {
    public static int pair(int[] arr, int target) {
        Arrays.sort(arr);
        int i = 0;
        int count = 0;
        int j = arr.length - 1;
        while (i < j) {
            if (arr[i] + arr[j] == target) {
                count++;
                i++;
                j--;
            } else if (arr[i] + arr[j] < target) {
                i++;
            } else {
                j--;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 7, -1};
        System.out.println(pair(arr, 6));
    }
}
