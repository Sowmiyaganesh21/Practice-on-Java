import java.util.HashSet;
import java.util.Scanner;
public class Security_key {
    public static int key(int data){
        int count=0;
       int[] digit=new int[10];
        while(data>0){ 
           int rem=data%10;
            digit[rem]++;
            data/=10;
        }
        for(int i=0;i<10;i++){
            if(digit[i]>1){
                count++;
            }
        }
        return count;
    }
    
    public  static int security(int data){
        HashSet<Integer> seen=new HashSet<>();
        HashSet<Integer> repeat=new HashSet<>();
        while(data>0){
            int rem=data%10;
            data/=10;
            if(seen.contains(rem)){
                repeat.add(rem);
            }
            else
            seen.add(rem);
        }
        return repeat.size();
    }
public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
   
    int data=input.nextInt();
    System.out.println(security(data));
    input.close();
}
    
}
