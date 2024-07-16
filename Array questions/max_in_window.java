public class max_in_window {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 2, 1, 8, 6, 9 };
        int k = 3;
        int n = arr.length;
        for (int i = 0; i <= n - k; i++) {
            System.out.println(max(arr, i, i + k));
        }
    }

    public static int max(int[] arr, int start, int end) {
        int maxi = arr[start];
        for (int k = start + 1; k < end; k++) {
            if (arr[k] > maxi) {
                maxi = arr[k];
            }
        }
        return maxi;
    }
}
