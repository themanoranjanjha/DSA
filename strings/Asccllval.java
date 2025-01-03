package strings;
// Print ASCII value of each character in a string.
public class Asccllval {
    public static void main(String[] args) {
        String str = "Hello, World!";
        System.out.println("Original String: " + str);
        getAsciiValue(str);
    }
    public static void getAsciiValue(String str) {
        int asciiValue = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            asciiValue += (int) ch;
            System.out.println("ASCII Value of '" + ch + "' is: " + asciiValue);
            asciiValue = 0;
        }
        
    }
}
