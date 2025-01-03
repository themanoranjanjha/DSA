package strings;
import java.util.*;

public class MaxOccurChar {
    
    public static void main(String[] args) {
    
       HashMap <Character, Integer> map = new HashMap<>();
       String str = "Hello, World!";
       for (int i = 0; i < str.length(); i++) {
        char ch = str.charAt(i);
        if (map.containsKey(ch)) {
            map.put(ch, map.get(ch) + 1);
           }
        else if(ch == ' '){
            continue;
        }
        else {
              map.put(ch, 1); 
            }
        }
  
                char maxChar = ' ';
                int maxCount = 0;
                for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                    if (entry.getValue() > maxCount) {
                        maxChar = entry.getKey();
                        maxCount = entry.getValue();
                        }
                
                        }
                        System.out.println("The character '" + maxChar + " max occurs " + maxCount + "");
                
                        char minChar = ' ';
                        int minCount = Integer.MAX_VALUE;
                        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                            if (entry.getValue() < minCount) {
                                minChar = entry.getKey();
                                minCount = entry.getValue();
                            }
                        }
                        System.out.println("The character '" + minChar + "' occurs the least: " + minCount + " times.");

    }
}
