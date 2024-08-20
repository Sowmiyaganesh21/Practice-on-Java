import java.util.HashMap;

public class Encode_no {
    public static int encode(int data){
        HashMap<Integer , Integer> count=new HashMap<>();
        while(data>0){
            int rem=data%10;
            data/=10;
            count.put(rem,count.getOrDefault(rem,0)+1);
        }
        int max=0;
        for(int digit:count.values()){
            if(digit>max)
            max=digit;
        } return max;
    }
    public static int enn(int data){
        int[] digit=new int[10];
        int max=0;
        while(data>0){
            int rem=data%10;
            digit[rem]++;
            data/=10;
            for(int count:digit){
                if(count>max)
                max=count;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.println(enn(572378333));
    }
}
