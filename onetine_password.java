public class onetine_password {
    public static int prime(int a,int b){
        int sum=Math.abs(a+b);
        if(sum%2==0){
            return sum;
        }
        for(int i=3;i<=Math.sqrt(sum);i+=2){
            if(sum%i==0)
            return 0;
        }
        return sum;
    }
        
    public static void main(String[] args) {
        System.out.println(prime(-97,47));

    }
}
