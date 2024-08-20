import java.util.Scanner;

public class Garments_company {
    public static int apparel(int[] plots){
        int count=0;
        for(int i=0;i<8;i++){
            double sqrt=Math.sqrt(plots[i]);
            if(sqrt==(int) sqrt)
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] plots=new int[8];
        for(int i=0;i<8;i++){
            plots[i]=input.nextInt();
        }
        System.out.println(apparel(plots));
        input.close();
    }
}
