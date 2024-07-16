import java.util.HashMap;
import java.util.Map;

public class subarray_sum {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 8, 10 };
        int k = 10;
        findSubarraysWithSumK(arr, k);
    }

    public static void findSubarraysWithSumK(int[] arr, int k) {
        Map<Integer, Integer> prefixSumMap = new HashMap<>();
        int currentSum = 0;
        prefixSumMap.put(0, -1); // To handle cases where subarray starts from index 0

        for (int j = 0; j < arr.length; j++) {
            currentSum += arr[j];

            if (prefixSumMap.containsKey(currentSum - k)) {
                printArr(arr, prefixSumMap.get(currentSum - k) + 1, j);
            }

            prefixSumMap.put(currentSum, j);
        }
    }

    public static void printArr(int[] arr, int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
