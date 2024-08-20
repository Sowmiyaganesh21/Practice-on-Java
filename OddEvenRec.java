public class OddEvenRec {
    public static int odd(int start, int end) {
        if (end == 0) return 0;
        System.out.print(end + " ");
        return odd(start, end % 2 != 0 ? end - 1 : end);
        
    }

    public static void main(String[] args) {
        odd(1, 15);


    }
}
