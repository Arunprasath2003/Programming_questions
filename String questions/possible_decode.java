public class possible_decode {
    public static int countDecodings(String digits) {
        int n = digits.length();
        int[] dp = new int[n + 1];
        dp[0] = 1;

        for (int i = 1; i <= n; i++) {
            if (digits.charAt(i - 1) != '0') {
                dp[i] += dp[i - 1];
            }

            if (i > 1 && isValidTwoDigit(digits.charAt(i - 2), digits.charAt(i - 1))) {
                dp[i] += dp[i - 2];
            }
        }
        return dp[n];
    }

    public static boolean isValidTwoDigit(char a, char b) {
        int num = (a - '0') * 10 + (b - '0');
        return num >= 10 && num <= 26;
    }

    public static void main(String[] args) {
        String digits1 = "121";
        System.out.println("Number of possible decodings for " + digits1 + ": " + countDecodings(digits1));

        String digits2 = "1234";
        System.out.println("Number of possible decodings for " + digits2 + ": " + countDecodings(digits2));
    }
}
