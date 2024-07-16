import java.util.*;

public class sortOddEven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int[] odd = new int[n];
        int[] even = new int[n];
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                even[i] = arr[i];
            } else {
                odd[i] = arr[i];
            }
        }
        Arrays.sort(odd);
        Arrays.sort(args);
        ;
        int count = 0;
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            if (odd[i] > 0) {
                result[count] = odd[i];
                count++;
            }
        }
        for (int i = 0; i < n; i++) {
            if (even[i] > 0) {
                result[count] = even[i];
                count++;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(result[i]);
        }
        in.close();
    }
}
