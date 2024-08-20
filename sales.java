import java.util.Scanner;

public class sales {
    public static void revenue(int[][] arr){
        int n=3,m=4;
        int[] maxre=new int[n];
        for(int i=0;i<n;i++){
            int max=Integer.MIN_VALUE;
            for(int j=0;j<m;j++){
                max=Math.max(max,arr[i][j]);
            }
            maxre[i]=max;
        }
        for(int i=0;i<n;i++){
            System.out.print(maxre[i] + " ");
        }
        
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=3,m=4;
        int[][] arr=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=input.nextInt();
            }
        }
        revenue(arr);
        input.close();
    }
}
