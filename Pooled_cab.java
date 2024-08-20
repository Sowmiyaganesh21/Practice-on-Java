import java.util.Scanner;

public class Pooled_cab {
    public static void services(int[] cab,int n){
        for(int i=1;i<n;i++){
            if(cab[i]>30 && cab[i]<50){
            System.out.print(cab[i]+" ");
        }
        }
    }
public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    int n=input.nextInt();
    int[] cab=new int[n];
    for(int i=0;i<n;i++){
        cab[i]=input.nextInt();
    }
    services(cab,n);
    input.close();
}
}
