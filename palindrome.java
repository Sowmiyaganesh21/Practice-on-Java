

public class palindrome {
    public static boolean palin(int num){
        int rem=0;
        while(num>0){
            rem=rem*10+num%10;
            num/=10;}
            return rem==num;
        }
    public static void main(String[] args) {
        if(palin(143)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("no");
        }
    }
}
