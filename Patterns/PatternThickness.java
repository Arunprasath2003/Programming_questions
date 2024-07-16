import java.util.Scanner;

class PatternThickness {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of rows and columns
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Create a 2D array to store the characters
        char[][] matrix = new char[rows][cols];

        // Get the characters from the user
        System.out.println("Enter the characters row by row:");
        for (int i = 0; i < rows; i++) {
            String line = scanner.nextLine();
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = line.charAt(j);
            }
        }

        // Get the thickness value from the user
        System.out.print("Enter the thickness: ");
        int thickness = scanner.nextInt();

        // Print the top border
        for (int i = 0; i < thickness; i++) {
            printBorder(cols + 2 * thickness);
        }

        // Print the middle section with left and right borders
        for (int i = 0; i < rows; i++) {
            for (int t = 0; t < thickness; t++) {
                System.out.print("*");
            }
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j]);
            }
            for (int t = 0; t < thickness; t++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Print the bottom border
        for (int i = 0; i < thickness; i++) {
            printBorder(cols + 2 * thickness);
        }
    }

    private static void printBorder(int length) {
        for (int i = 0; i < length; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
