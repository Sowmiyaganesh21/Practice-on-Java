import java.util.Arrays;
public class OddEven {
    public static void digit(int[] arr){//12 10 14 15
        int min=arr[0];
        int sum=0;
        for(int i=0;i<arr.length;i++)
            if(arr[i]<min) min=arr[i];        
        Arrays.sort(arr);        
                if (min % 2 != 0) {
                    for (int i = 0; i < arr.length; i++) {
                        if (arr[i] % 2 != 0) {
                            System.out.print(arr[i] + " ");
                        }
                    }
                    for (int i = 0; i < arr.length; i++) {
                        if (arr[i] % 2 == 0) {
                            System.out.print(arr[i] + " ");
                        }
                    }
                } else {
                    for (int i = 0; i < arr.length; i++) {
                        if (arr[i] % 2 == 0) {
                            System.out.print(arr[i] + " ");
                        }
                    }
                    for (int i = 0; i < arr.length; i++) {
                        if (arr[i] % 2 != 0) {
                            System.out.print(arr[i] + " ");
                        }
                    }
                }
            }
        
    public static void main(String[] args) {
        int[] arr={12,11,17,15};
        digit(arr);
    }
    
}
