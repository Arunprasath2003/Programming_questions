public class WildcardMatching {

    public static void main(String[] args) {
        System.out.println(isMatch("baaabab", "*****ba*****ab")); // true
        System.out.println(isMatch("baaabab", "baaa?ab")); // true
        System.out.println(isMatch("baaabab", "ba*a?")); // true
        System.out.println(isMatch("baaabab", "a*ab")); // false
    }

    public static boolean isMatch(String text, String pattern) {
        int textLen = text.length();
        int patternLen = pattern.length();

        // dp[i][j] will be true if the first i characters in text match the first j
        // characters of pattern
        boolean[][] dp = new boolean[textLen + 1][patternLen + 1];

        // Empty pattern can match with empty string
        dp[0][0] = true;

        // Only '*' can match with empty string
        for (int j = 1; j <= patternLen; j++) {
            if (pattern.charAt(j - 1) == '*') {
                dp[0][j] = dp[0][j - 1];
            }
        }

        // Fill the table in bottom-up fashion
        for (int i = 1; i <= textLen; i++) {
            for (int j = 1; j <= patternLen; j++) {
                // If the current characters match or pattern has '?'
                if (pattern.charAt(j - 1) == '?' || pattern.charAt(j - 1) == text.charAt(i - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                }
                // If pattern has '*', it can match with an empty sequence or any sequence of
                // characters
                else if (pattern.charAt(j - 1) == '*') {
                    dp[i][j] = dp[i][j - 1] || dp[i - 1][j];
                }
                // If characters don't match
                else {
                    dp[i][j] = false;
                }
            }
        }

        return dp[textLen][patternLen];
    }
}
