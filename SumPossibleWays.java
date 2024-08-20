public  class SumPossibleWays {
    public static int ways(int num){
        int count=0;
        for(int i=0;i<=num;i++){
            for(int j=0;j<=num;j++){
                for(int k=0;k<=num;k++)
                if(i+j+k==num){
                    count++;
                }
            }
        }
        return count;
    }
    public int ways2(int num){
        int result=0;
        for(int i=0;i<=num;i++){
            result=((num+1)*(num+2))/2;
         }
          return result;
    }
    public static void main(String[] args) {
        System.out.println(ways(2));
        System.out.println(ways(2));
    }
}
