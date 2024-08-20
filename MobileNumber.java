public class MobileNumber{
    public static int mobile(long num){
        //9880127431- 
        long result=0,current=0;
        long fD=num/(long)Math.pow(10,String.valueOf(num).length()-1);
        if(fD%2!=0){
            result=(long)fD+1;
            current=result; 
        }
        else{
            result=fD;
            current=result;
        }
        while(num>0){
            long digit=num%10;
            num/=10;
            if(current%2==0){
                result+=digit;
            }
            else{
                result-=digit;
            }
            current=result;
if(num==0){
    break;
}
        }
        return (int)result;
    }
    public static void main(String[] args) {
        System.out.println(mobile(9880127431l));
    }
}