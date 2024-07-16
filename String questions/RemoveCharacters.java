import java.util.*;
public class RemoveCharacters {
    public static void main(String[] args) {
        String s1 = "expErIence";
        String s2 = "En";
        System.out.println(removeCharacters(s1, s2)); // Expected output: "exprIece"
    }
    public static String removeCharacters(String s1, String s2) {
        Set<Character> charsToRemove = new HashSet<>();
        // Add characters of s2 to the set
        for (int i = 0; i < s2.length(); i++) {
            charsToRemove.add(s2.charAt(i));
        }
        StringBuilder result = new StringBuilder();
        // Iterate over s1 and append characters that are not in the set
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            if (!charsToRemove.contains(c)) {
                result.append(c);
            }
        }
        return result.toString();
    }
}
//Time Complexity: O(n+m) n->length of s1, m->length of s2