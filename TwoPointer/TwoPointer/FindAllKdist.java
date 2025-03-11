package TwoPointer;

import java.util.ArrayList;
import java.util.List;

public class FindAllKdist {
    public static void main(String[] args) {
        int key=9;
        int k=1;
        int[] nums = {3,4,9,1,3,9,5};
        List<Integer> res = findAllKdist(nums, key, k);
        for (int i = 0; i < res.size(); i++) {
            System.out.print(res.get(i) + " ");
        }
    }
    static List<Integer> findAllKdist(int[] nums, int key, int k){
       List<Integer> result = new ArrayList<>();
        List<Integer> KeyInd = new ArrayList<>();

        for(int i = 0; i<nums.length; i++){
            if(nums[i]==key){
                
                KeyInd.add(i);
            }
        }

        for(int i = 0 ; i<nums.length; i++){
            for(int j : KeyInd){
                if(Math.abs(i-j)<=k){
                    result.add(i);
                    break;
                }
            }
        }
        return result;
    }

}
