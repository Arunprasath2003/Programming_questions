class RunLengthEncoding {
    public static String encode(String s) {
        int n = s.length();
        int[] arr = new int[256];
        for (int i = 0; i < n; i++) {
            arr[s.charAt(i)]++;
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (arr[s.charAt(i)] > 0) {
                result.append(s.charAt(i));
                result.append(arr[s.charAt(i)]);
            }
            arr[s.charAt(i)] = 0;
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String s = "aabccc";
        String encoded = encode(s);
        System.out.println(encoded); // Output: "a2b1c3"
    }

}
