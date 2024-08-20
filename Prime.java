

public class Prime{
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        if (num % 2 == 0) {
            return false;
        }
        int sqrtNum = (int) Math.sqrt(num);
        for (int i = 3; i <= sqrtNum; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }    
        return true;
    }
        public static void main(String[] args) {
            int num1 = 7;
            int num2 = 10;
    
            boolean isPrime1 = isPrime(num1);
            boolean isPrime2 = isPrime(num2);
    
            System.out.println(num1 + " is prime: " + isPrime1);
            System.out.println(num2 + " is prime: " + isPrime2);
        }
    }

