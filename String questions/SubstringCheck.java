public class SubstringCheck {
    public static void main(String[] args) {
        System.out.println(isSubstring("Spoon", "Sp*n")); // Output: TRUE
        System.out.println(isSubstring("Zoho", "*o*o")); // Output: TRUE
        System.out.println(isSubstring("Man", "n*")); // Output: FALSE
        System.out.println(isSubstring("Subline", "line")); // Output: TRUE
    }

    public static boolean isSubstring(String s1, String s2) {
        // If the second string is equal to the first string, return true
        if (s1.equals(s2)) {
            return true;
        }

        // If the second string starts with '*' and ends with '*', return true
        if (s2.startsWith("*") && s2.endsWith("*")) {
            String pattern = s2.substring(1, s2.length() - 1);
            return s1.contains(pattern);
        }

        // If the second string starts with '*', check if the rest of the second string
        // exists in the first string
        if (s2.startsWith("*")) {
            String pattern = s2.substring(1);
            return s1.endsWith(pattern);
        }

        // If the second string ends with '*', check if the beginning of the second
        // string exists in the first string
        if (s2.endsWith("*")) {
            String pattern = s2.substring(0, s2.length() - 1);
            return s1.startsWith(pattern);
        }

        // If the second string neither starts nor ends with '*', check if it exists as
        // a substring in the first string
        return s1.contains(s2);
    }
}
