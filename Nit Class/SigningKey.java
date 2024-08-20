public class SigningKey {
    public static int key(int num1,int num2,int num3){
        int max1=0,max2=0,max3=0,min1=0,min2=0,min3=0;
        while(num1>0 && num2>0 && num3>0){
            int rem1=num1%10;
            int rem2=num2%10;
            int rem3=num3%10;
            // max1=Math.max(rem1,max1);    a > b ? (a > c ? a : c) : (b > c ? b : c);
            // max2=Math.max(rem2,max2);
            // max3=Math.max(rem3,max3);
            if(rem1>max1) max1=rem1;
            if(rem2>max2) max2=rem2;
            if(rem3>max3) max3=rem3;
            if(rem1>min1 && rem1<max1) min1=rem1;
            if(rem2>min2 && rem2<max2) min2=rem2;
            if(rem3>min3 && rem3<max3) min3=rem3;
            num1/=10;
            num2/=10;
            num3/=10;
            
        }
        return (max1+max2+max3)+(min1+min2+min3);
    }
    public static void main(String[] args) {
        System.out.println(key(3521,2452,1352));
    }
}
