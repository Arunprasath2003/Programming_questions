public class MoveZeros {
    public static void main(String[] args) {
        int[] nums = { 1, 0, 4, 0, 2 };
        int j = 0; // This pointer will keep track of the position to place the next non-zero
                   // element

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                // Swap nums[i] with nums[j] if i and j are different
                if (i != j) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
                j++; // Move j to the next position for the potential non-zero element
            }
        }

        // Print the result
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
