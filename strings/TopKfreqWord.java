package strings;

// import java.util.List;
import java.util.*;
// 692. Top K Frequent Words

public class TopKfreqWord {
    public static void main(String[] args) {
        
        String[] words = {"i", "love", "leetcode", "i", "love", "coding"};
        int k = 2;
        List<String> res = topKFrequent(words, k);
        System.out.println(res);
    }

     public static List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a,b) -> {
            if (a.getValue().equals(b.getValue())) {
                return a.getKey().compareTo(b.getKey());
            } else {
                return b.getValue() - a.getValue();
            }
        });
        List<String> result = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            result.add(list.get(i).getKey());
        }
        return result;
     }
}
