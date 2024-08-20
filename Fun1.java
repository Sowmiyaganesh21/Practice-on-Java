public class Fun1 {
    public static void employee(int arr[]){
        int[] arr1 = new int[arr.length];
        int[] arr2 = new int[arr.length];
        
        int evenCount = 0;
        int oddCount = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] < 0){
                arr[i] = Math.abs(arr[i]);
            }
            if(arr[i] % 2 == 0){
                arr1[evenCount++] = arr[i];
            } else {
                arr2[oddCount++] = arr[i]; 
            }
        }
        int a = 0, b = 0;
        for(int i = 0; i < evenCount; i++){
            a += arr1[i];
  
        }
        for(int i = 0; i < oddCount; i++){
            b += arr2[i];
        }

        // Print the sums of even and odd elements
        System.out.println(  a);
        System.out.println( b);
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 8, 3, 2, 6};
        employee(arr);
    }
}
