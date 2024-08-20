public class onlinegames {
    public static int game(int num,int n){
        int rem=0;
        for(int i=5;n/i>=1;i*=5){
            rem+=n/i;
        }
        return rem;
    }
    public static void main(String[] args) {
        System.out.println(game(5,5));
    }
}
