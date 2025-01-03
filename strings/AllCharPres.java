package strings;

// Check if a string contains all letters from 'a' to 'z'.

public class AllCharPres {
    public static void main(String[] args) {
        // String str = "The quick brown fox jumps over the lazy dog";
        String str = "Hello, World!"; // Removed the extra comma
        boolean allCharPresent = true;

        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (str.indexOf(ch) == -1) {
                allCharPresent = false;
                break;
            }
        }

        if (allCharPresent) {
            System.out.println("The string contains all alphabets.");
        } else {
            System.out.println("The string does not contain all alphabets.");
        }
    }
    
}
