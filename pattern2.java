// public class Pattern1{
//     public static void pattern(int n){
//         // arr[0]=3;
//         int a=0;
//         for(int i=1;i<=n;i++){
//              a=a*10+3;
//              System.out.print(" "+a);
//         }
//     }

//     public static int recpattern(int n){
//         if(n==0){
//             return 0;
//         }
//         return n*10+3 + recpattern(n-1);
//     }
//     public static void main(String[] args) {
//         // pattern(5);
//         recpattern(5);
//     }
// }
public class pattern2{
    public static void star(int n){
        int a=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print(a+" ");
                a=a+1;
            }
            System.out.println();
        }
    }
    static void pythontcs(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int num =(i+j)%n+1;
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
    static void snacktcs(int m,int n,int mat[][]){
        
        for(int i=0;i<m;i++){
            if(i%2==0){
                for(int j=0;j<n;j++){
                    System.out.print(" "+mat[i][j]);
                }
                System.out.println();
            }
            else{
                for(int j=n-1;j>=0;j--){
                    System.out.print(" "+mat[i][j]);
                }
                System.out.println();
            }

        }
    }
    public static void main(String[] args) {
       int n=5;
        //star(n);
        pythontcs(n);
    //   int[][] mat={{1,2,3},{4,5,6},{7,8,9}};
    //     snacktcs(3,3,mat);
    }
}