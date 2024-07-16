public class ReverseWords {
    public static void main(String[] args) {
        String input = "I love India";
        String reversed = reverseWords(input);
        System.out.println(reversed); // Output: three two one
    }

    public static String reverseWords(String str) {
        // Base case: if the string is empty, return an empty string
        if (str.isEmpty()) {
            return str;
        }

        // Find the last space in the string
        int lastSpaceIndex = str.lastIndexOf(' ');

        // If there's no space, the string is a single word
        if (lastSpaceIndex == -1) {
            return str;
        }

        // Extract the last word and the rest of the string
        String lastWord = str.substring(lastSpaceIndex + 1);
        String restOfString = str.substring(0, lastSpaceIndex);

        // Use recursion to reverse the rest of the string
        return lastWord + " " + reverseWords(restOfString);
    }
}
