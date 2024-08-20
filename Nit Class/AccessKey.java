public class AccessKey {
    public static int key(int num1,int num2,int num3){
        int max1,max2,max3,i=0,sum=0;
        int min1,min2,min3;
        max1=max2=max3=min1=min2=min3=0;
        while(num1>0 && num2>0 && num3>0){
            int rem1=num1%10;
            int rem2=num2%10;
            int rem3=num3%10;
            //  if(i%2 == 0){
            //     int max=(r1>r2)?((r1>r3)?r1:r3):((r2>r3)?r2:r3);
            //     sum=(sum10)+max;
            // }
            // else{
            //     int min=(r1<r2)?((r1<r3)?r1:r3):((r2<r3)?r2:r3);
            //     sum=(sum*10)+min;
            if(i%2==0){
            if(rem1>rem2) max1=rem2;
            if(rem2>rem3) max2=rem3;
            if(rem3>rem1) max3=rem1;
            sum=sum*10+max1+max2+max3;
        }else{
            if(rem1<rem1) min1=rem1;
            if(rem2<rem2) min2=rem2;
            if(rem3<rem3) min3=rem3;
            sum=sum*10+min1+min2+min3;
        }
            i++;
            num1/=10;
            num2/=10;
            num3/=10;
        }
        return sum;
    }
    public static void main(String[] args) {
        int n=key(3521, 2452,1352);
        System.out.println(n % 10 + " " + (n / 10) % 10 + " " + (n / 100) % 10 + " " + (n / 1000) % 10);
    }
}
