public class Kata1 {
    public static void main(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0 ; i++) {
            char character = str.charAt(i);
            reverse = reverse + character;
        }
    }
}