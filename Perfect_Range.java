

public class Perfect_Range {
    public static void range(){
        int sum=0;
        for(int i=1;i<100;i++){
            for(int j=1;j<i;j++){
                if(i%j==0){
                sum+=j;
            }
            }
            if(sum==i){
                System.out.println(sum);
            }
            sum=0;
        }
    }
    public static void main(String[] args) {
        range();
    }
}

// public class PerfectNumbersDemo {

//     public static void main(String[] args) {
//       IntStream.range(1, 100)
//           .filter(PerfectNumbersDemo::isPerfect)
//           .forEach(System.out::println);
//     }
  
//     private static boolean isPerfect(int number) {
//       return number == IntStream.rangeClosed(1, number / 2)
//           .filter(i -> number % i == 0)
//           .sum();
//     }
//   }
