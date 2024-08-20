

public class Strong {
    public static boolean fact(int n){
        int sum=0;
        int temp=n;
        while(temp>0){
           int  rem=temp%10;
            sum+=factorial(rem);
            temp/=10;
        }
        return sum==n;
    }
    private static int factorial(int n){
        int fact=1;     
        for(int i=1;i<=n;i++){
            fact*=i;
            }
            return fact;
    }
    public static void main(String[] args) {
        int n=145;
        System.out.println(fact(n));
    }
}
