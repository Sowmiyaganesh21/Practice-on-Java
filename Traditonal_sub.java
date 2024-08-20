import java.util.Scanner;
public class Traditonal_sub {
    public static int sum(int arr[],int k){
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<=n-k;i++){
            int current=0;
            for(int j=i;j<i+k;j++){
                current+=arr[j];
            }
            max=Math.max(max,current);
        }
        return max;
    }

    public static int sum1(int arr[],int k){
        int n=arr.length;
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        int current=sum;
        for(int i=k;i<n;i++){
            current-=arr[i-k];
            current+=arr[i];
            sum=Math.max(sum,current);
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int arr[]=new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=input.nextInt();
        }        
        System.out.println(sum(arr, 3));
        System.out.println(sum1(arr, 3));
        input.close();
    }
}
