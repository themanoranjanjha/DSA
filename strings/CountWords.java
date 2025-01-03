package strings;

public class CountWords {
    public static void main(String[] args) {
        String str = "Hello, I am a Java Developer";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++;
            }
        }
        System.out.println("Number of words in the string: " + (count + 1));
    }
    
}
