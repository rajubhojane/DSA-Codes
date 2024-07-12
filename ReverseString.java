public class ReverseString {
    public static void main(String[] args) {
        String str = "ABCD";
        String rev = ""; // Initialize rev to an empty string
        int len = str.length();
        for (int i = len - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        System.out.println(rev); // Print the reversed string
    }
}
