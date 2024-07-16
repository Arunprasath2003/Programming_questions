public class MatrixAddition {
    public static void main(String[] args) {
        int[][] arrays = {
                { 3, 5, 4, 2 },
                { 2, 4, 5 },
                { 4, 5, 6, 7, 8 },
                { 4, 9, 2, 1 },
                { 1, 2 }
        };

        long totalSum = 0;

        for (int[] array : arrays) {
            long number = convertArrayToNumber(array);
            totalSum += number;
        }

        System.out.println(totalSum);
    }

    public static long convertArrayToNumber(int[] array) {
        long number = 0;
        for (int digit : array) {
            number = number * 10 + digit;
        }
        return number;
    }
}
