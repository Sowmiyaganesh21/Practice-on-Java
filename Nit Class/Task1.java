import java.util.Arrays;
import java.util.Scanner;
public class Task1 {
    // static int digit(int num){
    //     int max=0,min=0,i=0;
    //     int result=0;
    //     int[] dig=new int[4];
    //     while(num>0){
    //         int rem=num%10;
    //         if(rem>max && min<rem) dig[i]=rem;
    //         num/=10;
    //         Arrays.sort(dig);
    //         if(dig[i]%2!=0){
    //              result-=dig[i];
    //         }
    //         else{
    //             result+=dig[i];
    //         }
    //     }    
    //     System.out.println(dig.toString());
    //     return result;
    // }
    public static int digit1(int n){
        int f=n%10,s=(n/10)%10,i=0;
        int[] dig=new int[4];
        int result=0;
        while(n>0){//4563
            int rem=n%10;
            dig[i]=rem;
            i++;
            if(rem>f && rem>s)s=rem;
            n/=10;}
            // if(s%2!=0) for(int j=1;j<dig.length;j++)
            //     result-=dig[i]-dig[i-1];
            //     else for(int k=1;k<dig.length;k++) result+=dig[k]+dig[k-1];
             if (s % 2 != 0) {
            Arrays.sort(dig);
            result = dig[dig.length - 2];
        } else {
            int sum = 0;
            for (int k = 0; k < dig.length; k++) {
                sum += dig[k];
            }
            result = sum;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner techie=new Scanner(System.in);
        int n=techie.nextInt();
        System.out.println(digit1(n));
        techie.close();
    }
}
