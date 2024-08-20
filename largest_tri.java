import java.text.DecimalFormat;

public class largest_tri {
    private static final DecimalFormat decfor = new DecimalFormat("0.00");
    public static void ans(int b1,int h1,int b2,int h2){
          
        double result1=(b1*h1)/2;
        double result2=(b2*h2)/2;
        System.out.println(decfor.format((Math.max(result1,result2))));
    }
    public static void main(String[] args) {
        ans(5,8,4,11);
    }
}
