public class PatternedSummation {
    public static int sum(int n,int op){
        int result=0;
        if(op==1){
        for(int i=0;i<n;i++){
            if(i%2==0)
            result+=n-i;
            else result-=n-i;
        }
        }
        else{
            for(int i=0;i<n;i++){
                if(i%2==0 &&i!=0)result-=n-i;
                else result+=n-i;
            }}return result;
    }
    public static void main(String[] args){
        System.out.println(sum(6,2));
    }
}
