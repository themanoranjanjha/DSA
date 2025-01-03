package strings;
// Find a specific substring within a string.

public class spesfSubSTR {
    public static void main(String[] args) {
        String str = "Hello, grrgWorld!";
        String subStr = "World";
        int index = str.indexOf(subStr);
        if (index != -1) {
            System.out.println("Substring found at index: " + index);
        } else {
            System.out.println("Substring not found");
        }
    }
    
}