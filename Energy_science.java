import java.util.Scanner;
public class Energy_science {
    public static void lab(int[] energy){
        int product=1;
        for(int i=0;i<3;i++){
         product*=energy[i];
         System.out.print(" "+product);
        }
        
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] energy=new int[3];
        for(int i=0;i<3;i++){
            energy[i]=input.nextInt();
        }
        lab(energy);
        input.close();
    }
}
