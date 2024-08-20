import java.util.ArrayList;
import java.util.Arrays;

public class Union_Intersec {
    public static int[] intersection(int[] arr1,int[] arr2){
        //6 7 8 5 8 1 9
        //2 4 6 8 4 7 0------>8
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i=0,j=0;
        ArrayList<Integer> result=new ArrayList<>();
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                i++;
            }
            else if(arr1[i]>arr2[j]){
                j++;
            }
            else{
                result.add(arr1[i]);
                j++;
            }
        }//return result.stream().mapToInt(Integer::intValue).toArray();
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
    public static void main(String[] args) {
        int arr1[]={6 ,7 ,8 ,5, 8 ,1, 9};
        int arr2[]={2 ,4 ,6, 8 ,4 ,7 ,0};
        System.out.print(intersection(arr1,arr2));
    }
    
}
