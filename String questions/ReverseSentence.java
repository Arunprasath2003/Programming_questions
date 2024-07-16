import java.util.*;

class ReverseSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String rev = "";

        // Breaking the sentence into words
        String s[] = str.split(" ");

        // Adding the words stored in the array to the last
        for (int j = 0; j < s.length; j++) {
            rev = s[j] + " " + rev;
        }

        // Printing the reversed sentence
        System.out.println("Reversed sentence: " + rev);
        System.out.println(s[0]);
    }
}
