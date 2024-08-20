

public class Sum_Series {
    public static int series() {
        int fact = 1;
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            fact = fact * i;
            sum += fact / i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(series());
    }
}