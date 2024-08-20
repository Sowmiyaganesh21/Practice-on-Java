public class Dasarathey_doll {
    public static String sing(int val){
        if(val>100 && val<0){
            return "invalid number";
        }
        if(val%2==0){
            return "will sing";
        }
        else{
            return "not sing";
        }
    }
    public static void main(String[] args) {
        System.out.println(sing(101));
    }
    
}
