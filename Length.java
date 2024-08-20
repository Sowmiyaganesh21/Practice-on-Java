

public class Length {
    public static int len(int[] arr){
        int count=0;
        for(int i:arr){
            count++;
        }
        return count; 
    }
    public static void main(String[] args) {
        // int arr[]={1,2,3,4,5,6,6};
        // System.out.println(len(arr));
     int a=10;
     int b=++a + a++ + a++;
     System.out.println(b);   
    
    }
    
}
