
// Java program to count frequencies of array items
import java.util.*;

class CountFrequencies {
    static void countFreq(int arr[], int n) {
        Map<Integer, Integer> mp = new HashMap<>();
        // Traverse through array elements and
        // count frequencies
        for (int i = 0; i < n; i++) {
            if (mp.containsKey(arr[i])) {
                mp.put(arr[i], mp.get(arr[i]) + 1);

            } else {
                mp.put(arr[i], 1);
            }
        }
        // Traverse through map and print frequencies
        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    // Driver code
    public static void main(String args[]) {
        int arr[] = { 2, 3, 2, 6, 1, 6, 2 };
        int n = arr.length;
        countFreq(arr, n);
    }
}