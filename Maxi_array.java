public class Maxi_array {
    public static int num(int[] arr){
        int max= Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,7,9,5};
        System.out.println(num(arr));
    }
    
}
