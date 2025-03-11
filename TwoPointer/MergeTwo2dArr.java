// 2570. Merge Two 2D Arrays by Summing Values
// Easy
// nums1[i] = [idi, vali] indicate that the number with the id idi has a value equal to vali.
// nums2[i] = [idi, vali] indicate that the number with the id idi has a value equal to vali.
// Each array contains unique ids and is sorted in ascending order by id.
// Merge the two arrays into one array that is sorted in ascending order by id.



import java.util.*;

public class MergeTwo2dArr {

    public static void main(String[] args) {
        int[][] nums1 = {{1, 2}, {2, 3}, {4, 5}};
        int[][] nums2 = {{1, 4}, {3, 2}, {4, 1}};
        int[][] res = merge(nums1, nums2);
        for (int[] r : res) {
           System.out.println(Arrays.toString(r));
            // System.out.print(r[0] + " " + r[1]+" ");
        }
    }

    public static int[][] merge(int[][] nums1, int[][] nums2) {
        Map<Integer, Integer> map = new TreeMap();
       for (int i = 0; i < nums2.length; i++) {
             map.put(nums1[i][0], nums1[i][1]);    
       }
         for (int i = 0; i < nums2.length; i++) {
               if (map.containsKey(nums2[i][0])) {
                   map.put(nums2[i][0], map.get(nums2[i][0]) + nums2[i][1]);
               } else {
                   map.put(nums2[i][0], nums2[i][1]);
               }             
         }
        int[][] res = new int[map.size()][2];
        int i = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            res[i][0] = entry.getKey();
            res[i++][1] = entry.getValue();     
        }
        return res;
        
    }
}