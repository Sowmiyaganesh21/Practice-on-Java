
public class SumOfOdd {
    public static int odd(int dig){
        int sum=0;
        if(dig<0){
            dig=Math.abs(dig);
        }
        while(dig>0){
            int rem=dig%10;
            if(rem%2!=0){
                sum+=rem;
            }
            dig/=10;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(odd(12345));
        System.out.println(odd(-2352));
        System.out.println(odd(14567));
        System.out.println(odd(-67043));
        System.out.println(odd(0));
    }
}
