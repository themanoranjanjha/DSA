package strings;

// Remove the first, last, and Kth character from a string.


public class RemCharInString {
    public static void main(String[] args) {
        String str = "manasgi";
        int k = 4;
        System.out.println("After removing first, last and " + k + "th character: " + removeChar(str, k));
    }
    public static String removeChar(String str, int k) {
        StringBuilder sb = new StringBuilder();
        sb.append(str.substring(1, k-1));
        sb.append(str.substring(k , str.length()-1));
        return sb.toString();
    }
   
}
