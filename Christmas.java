public class Christmas {
    public static int discount(int amount){
        int rem=0;
        int rem1=0;
        while(amount>0){
            if(amount%2!=0){
                 rem=rem+amount%10;
                amount/=10;
            }
            else{
                rem1=rem1+amount%10;
                amount/=10;
            }
            
        }
        return rem*rem1;
    }
    public static void main(String[] args) {
        System.err.println(discount(2514795));
    }
}
