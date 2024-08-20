import java.util.Scanner;

public class subarray {

    public static void zerosum(int n,int[] arr){
        boolean find=false;
        for(int i=0;i<n;i++){
           int sum=+arr[i];
            for(int j=+1;j<n;j++){
                if(sum==0){
                    for(int k=0;k<n;k++){
                        System.out.println(" + arr[k]");
                        find=true;
                    }}System.out.println("\n");}}
        if(!find) System.out.println("zerosum is not available");
    }

    public static void pair(int n, int target, int[] arr) {
        int find = 0;
        for (int i = 0; i < n; i++) {
           for (int j = i + 1; j < n; j++) {
    if (arr[i] + arr[j] == target) {
        System.out.println("The pairs are (" + arr[i] + ", " + arr[j] + ")");
        find = 1;
    }
}
        }
        if(find==0) System.out.println("No pair found");
    }
    public static void triplet(int n, int target, int[] arr) {
        int find = 0;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    System.out.println((arr[i] + arr[j] + arr[k] == target) ? "The triplets are (" + arr[i] + ", " + arr[j] + ", " + arr[k] + ")" : "");
                    find = (arr[i] + arr[j] + arr[k] == target) ? 1 : find;
                }
            }
        }
        if(find==0) System.out.println("No triplet found");
    }

    public static void quadruplets(int n, int target, int[] arr) {
        int find = 0;
        for (int i = 0; i < n - 3; i++) {
            for (int j = i + 1; j < n - 2; j++) {
                for (int k = j + 1; k < n - 1; k++) {
                    for (int l = k + 1; l < n; l++) {
                        System.out.println((arr[i] + arr[j] + arr[k] + arr[l] == target) ? "Quadruplets are (" + arr[i] + ", " + arr[j] + ", " + arr[k] + ", " + arr[l] + ")" : "");
                        find = (arr[i] + arr[j] + arr[k] + arr[l] == target) ? 1 : find;
                    }
                }
            }
        }
        if(find==0)  System.out.println("No quadruplets found");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int target = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        // zerosum(n, arr);
        // pair(n, target, arr);
        // triplet(n, target, arr);
        quadruplets(n, target, arr);
        input.close();
    }
}
