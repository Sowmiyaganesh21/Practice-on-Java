

public class Armstrong {
    static boolean isArmstrongNumber(int num) {
        int originalNum = num;
        int sum = 0;
        int digits = countDigits(num);
        int temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            int power = 1;
            for (int i = 1; i <= digits; i++) {
                power *= digit;
            } sum += power;
            temp /= 10;}
        return sum == originalNum;
    }
    private static int countDigits(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }return count;
    }public static void main(String[] args) {
        int n = 153;
        if (isArmstrongNumber(n)) {
            System.out.println(n + " is an Armstrong number.");
        } else {
            System.out.println(n + " is not an Armstrong number.");
        }
    }
}