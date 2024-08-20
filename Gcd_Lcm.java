public class Gcd_Lcm {
    static int gcd(int val1,int val2){
        if(val2==0){
            return val1;
        }
        else{
            return gcd(val2,val1%val2);
        }
    }
    static int lcm(int val1,int val2,int sgcd){
        return (val1*val2)/sgcd;
    }
    public static void main(String[] args) {
        int sgcd=gcd(20, 30);
        System.out.println(gcd(20, 30));
        System.out.println(lcm(20, 30, sgcd));
    }
}
