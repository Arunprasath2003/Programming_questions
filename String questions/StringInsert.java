import java.util.*;

public class StringInsert {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = "GeeksGeeks";
        String s2 = "For";
        int index = 4;
        String result = "";
        for (int i = 0; i <= index; i++) {
            result = result + s1.charAt(i);
        }
        int count = 0;
        for (int i = index + 1; i < s2.length() + index + 1; i++) {
            result = result + s2.charAt(count);
            count++;
        }
        int temp = index + 1;
        for (int i = s2.length() + index + 1; i < s1.length() + s2.length(); i++) {
            result = result + s1.charAt(temp);
            temp++;
        }
        System.out.println(result);
        in.close();
    }
}
