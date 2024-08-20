public class Countmiss {
    public static int miss(String text){
        int count=0;
        for(char c:text.toCharArray()){
            if(Character.isLetter(c)){

            }
            else if(Character.isDigit(c)){

            }
            else{
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(miss("aaabc445@sad$hsagd^"));
    }
}
