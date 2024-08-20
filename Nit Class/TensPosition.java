public class TensPosition{
    public static void num(int val){
       int temp=val,count=0,i=0,rem=0;
     if (temp >= 100 && temp <= 999) System.out.println("100 <= val <= 999");
     else if (temp >= 2000 && temp <= 2999)System.out.println("2000 <= val <= 2999");
     else if (temp >= 3000 && temp <= 3999)System.out.println("3000 <= val <= 3999");
     else if (temp >= 4000 && temp <= 4999)System.out.println("4000 <= val <= 4999");
     else if (temp >= 5000 && temp <= 5999) System.out.println("5000 <= val <= 5999");
        while(val>0){
           count++;
            val/=10;}
        if(count%2!=0) System.out.println("invalid number");
        while(i<(count/2)+1){
            rem=temp%10;
            i++;
            temp/=10;
        }System.out.println("MId : "+(count/2+1)+ " position :" +rem);
    String position=((count/2+1)==1)?
                        "ones":((count/2+1)==2)? 
                            "tens":((count/2+1)==3)? 
                                "hundreds" : "more than hundreds";
                                System.out.println(position);
    }public static void main(String[] args) {
        num(123);}
}