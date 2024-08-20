
// // import java.util.HashSet;
// // import java.util.List;
// // import java.util.ArrayList;
// // import java.util.Arrays;
// import java.util.Scanner;


// public class Remove_Duplicate {
//     public static void duplicate(int[] arr){
//         int dupli=0;
//         for(int i=1;i<arr.length;i++){
//             if(arr[dupli]!=arr[i+1]){
//                 arr[dupli]=arr[i];
//             }
//         }
//     }

       
        


//     public static void removeDuplicates(int[] nums) {
//         int dupli= 0;
//         for (int j = 1; j < nums.length; j++) {
//             if (nums[dupli] != nums[j]) {
//                 dupli++;
//                 nums[dupli] = nums[j];
//             }
//         }
//     }
// }

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void dupli(){
         int arr[]={1,8,3,5,5,7,8};
        Set<Integer> val=new HashSet<>(Arrays.asList(1,8,3,5,5,7,8));
        for(int n:val){
            System.out.print(", " +n);
        }
        //  Set<Integer> set=new HashSet<>(Arrays.asList(10,10,20,25,30,25));
        // for(Integer num: set){
        //     System.out.print(" "+num);
        // }

    }
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 2, 2, 2, 3, 3 };

        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i = i + 1;
                arr[i] = arr[j];
            }
        }
        System.out.println(Arrays.toString(arr));
        dupli();
    }
}
