import java.util.Arrays;
public class DiffOfSubArray {
    // Ip 5 2 3 7 6 4 9 8 target=5
    // o/p (7,2)(8,3)(9,4)
    public static void diff(int[] arr, int target) {
        int i = 0;
        int j = 1;
        Arrays.sort(arr); // 2 3 4 5 6 7 8 9
        while (i < arr.length) {
            if (arr[j] - arr[i] == target) {
                System.out.print("(" + arr[j] + "," + arr[i] + ")  ");
                i++;
                j++;
            } else if (arr[j] - arr[i] > target) {
                i++;
            } else {
                j++;
            }
        }
    }    public static void main(String[] args) {
        int[] arr = { 5, 2, 3, 7, 6, 4, 9, 8 };
        diff(arr, 5);
    }
}