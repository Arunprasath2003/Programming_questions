public class ArrayToNumberSum {
    public static int arrayToNumberAndSum(int[] arr, int k) {
        // Convert array to a number
        int num = 0;
        for (int digit : arr) {
            num = num * 10 + digit;
        }

        // Add the number to k
        return num + k;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int k = 7;
        System.out.println(arrayToNumberAndSum(arr, k));  // Output: 130
    }
}
