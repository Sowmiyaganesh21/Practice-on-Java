import java.util.Arrays;
import java.util.Scanner;

public class bingo_lottery {
    public static int onlinegame(int[] card) {
        Arrays.sort(card); 
        int maxProduct = Integer.MIN_VALUE;
        for (int i = 0; i < card.length - 1; i++) {
            for (int j = i + 1; j < card.length; j++) {
                int product = card[i] * card[j];
                maxProduct = Math.max(maxProduct, product);
            }
        }

        return maxProduct;
    }
   public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    int[] card=new int[8];
    for(int i=0;i<8;i++){
        card[i]=input.nextInt();
    }
    System.out.println(onlinegame(card));
input.close();
   }
}
