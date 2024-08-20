class HashSquares{
    public static void sqaures(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if( i==0|| i==n-1|| j==0|| j==n-1){
                    System.out.print("*");
                }
                else{
                    System.out.print("#");
                }
            }
         System.out.printf(i<n-1?"\n":" ");     
        }
    }
    public static void HalfPyramid(int n){
        int a=1;
      for(int i=0;i<n;i++){
        for(int j=0;j<i+1;j++){
            System.out.print(a+" ");
            a++;
        }
        System.out.printf(i<n-1?"\n":" ");
      }
      }
      public static void rightHalfPyramid(int n){
        for(int i=0;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.printf(i<=n-1?"\n":" ");
        }
      }
      public static void leftHalfPyramid(int n){
        int s=0;
        for(int i=0;i<=n;i++){
            for(s=0;s<=n-i-1;s++)
                System.out.print(" ");
            for(int j=i;j<=n-s;j++)
                System.out.print("*");
            System.out.println();
        }
      }
    public static void fullPyramid(int n){
        for(int i=0;i<n;i++){
            for(int j=1;j<n+i;j++){
                if(j<n-i-1){
                    System.out.print(" ");
                }
                else {
                    System.out.print("* ");
                }
            }
        }

    }
    public static void zeroOne(int n){
        for(int i=0;i<n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0) System.out.print("1");
                else System.out.print("0");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        // sqaures(5);
         HalfPyramid(5);
        // rightHalfPyramid(5);
        // leftHalfPyramid(5);
        // zeroOne(5);
        // fullPyramid(5);

    }
}