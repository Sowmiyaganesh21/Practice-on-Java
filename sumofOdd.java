public class sumofOdd {
    public static int odd(int discount){
        int sum=0;
        while(discount>0){
            int rem=discount%10;
            if(rem%2!=0){
                sum+=rem;
            }
            discount/=10;
        }
        return sum;
    }
public static void main(String[] args) {
    System.out.println(odd(2514795));
}
}
