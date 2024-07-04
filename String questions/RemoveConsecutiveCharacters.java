import java.util.*;

class RemoveConsecutiveCharacters {
    public static String RemConsecutiveCharacters(String s) {
        int n = s.length();
        int i = 0;
        Stack<Character> stack = new Stack<>();
        while (i < n) {
            if (stack.isEmpty() || stack.peek() != s.charAt(i)) {
                stack.push(s.charAt(i));
                i++;
            } else {
                stack.pop();
                i++;
            }
        }
        String result = "";
        if (stack.isEmpty()) {
            return "No consecutive characters";
        } else {
            while (!stack.isEmpty()) {
                result = stack.peek() + result;
                stack.pop();
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "abaabd";
        System.out.println(RemConsecutiveCharacters(s));
    }
}