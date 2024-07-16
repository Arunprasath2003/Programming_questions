import java.util.*;

public class EvenLengthWords {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String[] sarr = s.split(" ");
        String result = "";
        for (int i = 0; i < sarr.length; i++) {
            if (sarr[i].length() % 2 == 0) {
                result = sarr[i] + " " + result;
            }
        }
        System.out.println(result);
        in.close();
    }
}
