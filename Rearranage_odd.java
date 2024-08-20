

public class Rearranage_odd {
    public static void even(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
              System.out.print(" "+arr[i]);
            }
        }
    }
    public static void odd(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                System.out.print(" "+arr[i]);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        even(arr);
        odd(arr);
    }
}
