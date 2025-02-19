package Recursion;

public class PalindromeStr {
    public static void main(String[] args) {
        String str = "abcba";
        System.out.println(checkPalindrome(str, 0, str.length()-1));
    
    }
    static boolean checkPalindrome(String str, int low, int high) {
        if (low >= high) {
            return true;
        }
        if (str.charAt(low) != str.charAt(high)) {
            return false;
        }
        return checkPalindrome(str, low+1, high-1);
    }
}
