import java.util.Arrays;
import java.util.Scanner;
public class Maximum_energy {
    public static int chemical(int n,int[] energy){
        Arrays.sort(energy);
        int result=0;
        for(int i=0;i<n;i++){
            result=energy[n-1]+energy[n-2];
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[] energy=new int[n];
        for(int i=0;i<n;i++){
            energy[i]=input.nextInt();
        }
        System.out.println(chemical(n,energy));
        input.close();
    }
    
}
