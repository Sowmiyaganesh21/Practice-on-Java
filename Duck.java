
public class Duck {
    public static int duck_num(int val) {
        int count = 0;
        while (val > 0) {
            int rem = val % 10;
            if (rem == 0) {
                count++;
            }
            val /= 10;
        }
        return count;
    }

    public boolean start(String value) {
        return value.startsWith("0");
    }

// Pattern pattern = Pattern.compile("^0");
// Matcher matcher = pattern.matcher(number);

// if (matcher.find()) {
//     System.out.println("The number starts with 0.");
// } else {
//     System.out.println("The number does not start with 0.");
// }
   

    public static void main(String[] args) {
        int val = 123405;
        if (duck_num(val) >= 1) {
            System.out.println("duck number");
        }
        String value1 = "012345";
        System.out.printf("^%d" +value1);
    }
}
