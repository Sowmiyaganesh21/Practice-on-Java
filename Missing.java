public class Missing {
    public static char data(String word1, String word2) {
        for (int i = 0; i < word1.length(); i++) {
            char current = word1.charAt(i);
            if (word2.indexOf(current) == -1) {
                return current;
            }
        }
        return '\0';
    }

    public static void main(String[] args) {
        String word1 = "abcdfijgerj";
        String word2 = "abcdfijger";
        System.out.println(data(word1, word2));
    }
}
