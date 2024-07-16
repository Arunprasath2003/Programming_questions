public class pattern_middle {
    public static void main(String[] args) {
        String inputWord = "PROGRAM";
        printMiddlePattern(inputWord);
    }

    public static void printMiddlePattern(String word) {
        int length = word.length();
        int middleIndex = length / 2;

        // Initialize an empty string to build each line
        String currentLine = "";

        // Iterate over each character starting from the middle
        for (int i = middleIndex; i >= 0; i--) {
            currentLine = word.substring(i, middleIndex + 1) + currentLine;
            // Calculate the leading spaces for the current line
            String leadingSpaces = " ".repeat(middleIndex - i);
            // Print the line with leading spaces
            System.out.println(leadingSpaces + currentLine);
        }
    }
}
