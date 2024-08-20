public class Transmit {
 public static int data(int num){
    int rem=0;
    while(num>0){
        rem=rem*10+num%10;
        num/=10;
    }
    return rem;
 }   
 public static void main(String[] args) {
    System.out.println(data(5783257));
 }
}
