public class OperationsWithoutUsingArith {
        private static int add(int a, int b) {
            while (b != 0) {
                int carry = a & b;
                a = a ^ b; 
                b = carry << 1; 
            }return a;
        } private static int subtract(int a, int b) {
            return add(a, negate(b)); 
        } private static int multiply(int a, int b) {
            if (b == 0) {
                return 0;
            }return add(a, multiply(a, subtract(b, 1))); 
        }private static int divide(int a, int b) {
            int divisor = negate(b); 
            int quotient = 0;
            int temp = a;
            while (greaterThanOrEqual(temp, divisor)) {
                temp = add(temp, divisor); 
                quotient = add(quotient, 1); 
            }return quotient;
        }private static int negate(int a) {
            return add(~a, 1); 
        }private static boolean greaterThanOrEqual(int a, int b) {
            return negate(subtract(a, b)) >>> 31 == 0; 
        }
        public static void main(String[] args) {
            int a = 10;
            int b = 5;
            System.out.println("Addition: " + add(a, b));
            System.out.println("Subtraction: " + subtract(a, b));
            System.out.println("Multiplication: " + multiply(a, b));
            System.out.println("Division: " + divide(a, b));
        }
    }

