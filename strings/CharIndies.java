package strings;
import java.util.HashMap;

// Find the first and last index of occurrence for each character in a string.

public class CharIndies {

    public static void findFirstAndLastIndices(String str){
        HashMap <Character, int[]> map = new HashMap<>();
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(!map.containsKey(ch)){
                map.put(ch, new int[]{i, i});
            }else{
                map.get(ch)[1] = i;
            }
        }

        for(Character ch : map.keySet()){
            int[] indices = map.get(ch);
            System.out.println("Character: " + ch + ", First Index: " + indices[0] + ", Last Index: " + indices[1]);
        }
       
    }
    public static void main(String[] args) {
        String str = "Hello, World!";
        findFirstAndLastIndices(str);
    }
    
}
