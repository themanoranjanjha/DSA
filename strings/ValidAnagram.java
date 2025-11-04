package strings;


public class ValidAnagram {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        boolean result = areAnagrams(str1, str2);
        System.out.println("Are the two strings anagrams? " + result);
    }

     public static boolean areAnagrams(String s, String t){
        if (s.length() != t.length()) {
            return false;    
        }

        int[] charCount = new int[26];
        for (int i = 0; i < s.length(); i++) {
            charCount[s.charAt(i) - 'a']++;
            charCount[t.charAt(i) - 'a']--;
        }
        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }
        return true;
     }
}
