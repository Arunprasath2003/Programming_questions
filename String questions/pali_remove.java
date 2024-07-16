import java.util.Scanner;

public class pali_remove {
    public static boolean isPalindrome(String word) {
        StringBuilder rev = new StringBuilder();
        for (int i = word.length() - 1; i >= 0; i--) {
            rev.append(word.charAt(i));
        }
        if (rev.toString().equals(word)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s;
        s = in.nextLine();
        String[] words = s.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (!isPalindrome(words[i])) {
                System.out.print(words[i] + " ");
            }
        }
        in.close();
    }
}
