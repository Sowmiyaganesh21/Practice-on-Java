import java.util.Scanner;

public class GIft_hampers {
    public static int hamp(int n,int m,int[] arr){
        int count=0;
        int sum=0;
        for(int num:arr){
            sum+=num;
            if(sum>=n && m>=0){
                count++;
                sum=0;
            }
            else if(sum>=n){
          m--;
          sum=0;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
         int n = scanner.nextInt(); // Total number of calories required
        int m = scanner.nextInt(); // Number of cheat days allowed

        int size = scanner.nextInt(); // Size of the calorie array
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt(); // Reading calorie values
        }

        int result = hamp(n, m, arr);
        System.out.println(result);

        scanner.close();

    }
}
