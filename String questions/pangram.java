import java.util.*;

public class pangram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s;
        s = in.nextLine();
        int count = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i)) && s.charAt(i) != ' ') {
                map.put(s.charAt(i), count++);
            }
        }
        if (count == 26) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        System.out.println(count);
        in.close();
    }
}
