public class Bucketize {
    public static int findMaxDigit(int num) {
        return String.valueOf(num)
        .chars()
        .map(Character::getNumericValue)
        .max().orElse(0);
    }
    public static void main(String[] args) {
        System.out.println(findMaxDigit(32387634));
    }
}
