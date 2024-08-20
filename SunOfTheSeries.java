public class SunOfTheSeries {
    // 1 4 9 16 25 36...n 
    static int loopseries(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i*i;
        }
        return sum;
    }
    static int recseries(int n){
        if(n==0){
            return 0;
        }
        return n*n+recseries(n-1);
    }
    public static void main(String[] args) {
        System.out.println(loopseries(5));
        System.out.println(recseries(5));
    }
}
