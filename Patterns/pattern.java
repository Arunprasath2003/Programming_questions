import java.util.*;
public class pattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s;
        s = in.next();
        int n = s.length();
        char[][] arr = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = ' ';
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) { arr[i][j] = s.charAt(i);}
            }
        }
        int count = 0;
        for (int i = n - 1; i >= 0; i--) {
            arr[count][i] = s.charAt(count);
            count++;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}