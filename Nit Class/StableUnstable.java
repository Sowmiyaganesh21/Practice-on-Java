// public class StableUnstable {
//     public static int result(int num1,int num2,int num3,int num4,int num5){
//         int stSum=0,Unsum=0;
//         int[] arr={num1,num2,num3,num4,num5};
//         for(int i=0;i<arr.length;i++){
//         if(values(arr[i])==1){
//             stSum+=arr[i];
//         }
//         else{
//             Unsum+=arr[i];
//         }
//     }
//         return stSum-Unsum;
//     }
//     public static int values(int arr){
//         int[] dup=new int[10];
//         int rem=0;
//         while(arr>0){
//            rem= arr%10;
//            dup[rem]++;
//             arr/=10;
//         }
//         int max=0;
//         max=dup[rem];
//         for (int i = 0; i < 10; i++) {
//             if (dup[i] > 0) {
//                 if (max == 0) max = dup[i];
//             else if (max != dup[i]) return 0;
//             }
//         }return 1;
//     }
//     public static void main(String[] args){
//         System.out.println(result(12,1313,122,678, 898));

//     }
// }

public class StableUnstable {
    public static int result(int... numbers) {
        int stableSum = 0, unstableSum = 0;
        for (int num : numbers) {
            if (isStable(num)) {
                stableSum += num;
            } else {
                unstableSum += num;
            }
        }
        return stableSum - unstableSum;
    }

    private static boolean isStable(int num) {
        if (num < 10) return true;
        
        int[] digit = new int[10];
        int count1 = 0;
        int nonzero= 0;
        
        while (num > 0) {
            int count = num % 10;
            if (++digit[count] == 1) count1++;
            if (nonzero == 0 && digit[count] > 1) {
                nonzero = digit[count];
            } else if (digit[count] > 1 && digit[count] != nonzero) {
                return false;
            }
            num /= 10;
        }
        
        return count1 == 1 || nonzero > 0;
    }

    public static void main(String[] args) {
        System.out.println(result(12, 1313, 122, 678, 898));
    }
}
