public class SumOfSeries2 {
    public static int series2(int n){
        int sum=0;
        int term=1;//1,2,4,8,16,32,64
        for(int i=0;i<n;i++){
            sum+=term;
            term*=2;
        }
        return sum;
    }
    public static int recseries2(int n,int term,int sum){
        if(n==0){
            return sum;
        }
        sum+=term;
        term*=2;
        return recseries2(n-1, term, sum);
    }
    public static void main(String[] args) {
        System.out.println(series2(7));
        System.out.println(recseries2(7, 1, 0));
    }
}
