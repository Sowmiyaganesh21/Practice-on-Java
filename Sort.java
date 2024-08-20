public class Sort {
    public static void sortArray(int[] arr) {
        int i = 0;
        while(i<arr.length-1){
            int j=i+1;
            while(j<arr.length){
                if(arr[j]<arr[i]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }j++;
            }i++;
           
            }
            for(int k=0;k<arr.length;k++){
                System.out.print(arr[k]);
        }

        // int temp=0;
        // for(int i=0;i<arr.length;i++){           
        //     for(int j=i+1;j<arr.length;j++){                
        //         if(arr[j]<arr[i]){
        //              temp=arr[i];
        //             arr[i]=arr[j];
        //             arr[j]=temp;
        //         }               
        //     }System.out.print(arr[i]);
        // }
    } public static void main(String[] args) {
        int[] arr = {0, 1, 2, 2, 1, 0, 0, 2, 0, 1, 0, 1};
        sortArray(arr);
        // for (int num : arr) {
        //     System.out.print(num + " ");
        // }
    }
}