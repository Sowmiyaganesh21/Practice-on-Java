public class InvertedFullPyramid {
    public static void reverse(int n) {
        for (int i = n; i >0; i--) {
            for (int j = 0; j <n+i; j++) {
                if (j < n - i) {
                    System.out.print("_");
                }else if(j>=n+i-1){
                    System.out.print("");
                }
                else if (i == n || j == n - i || j == n + i - 2) {
                    System.out.print("*");
                } else {
                    System.out.print("_");
                }
            }
            System.out.println();
        }
    }
    public static void hourGlass(int n){
        int l=0,s=0;
        for(int i=n;i>=0;i--){
            if(i<0) l=-i;
            else l=i;

            for(int j=0;j<n+l-s;j++){
                System.out.print(" *");
            }
            for(s=0;s<n-l;s++){
                System.out.print("_");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // reverse(5);
        hourGlass(5);
    }
}