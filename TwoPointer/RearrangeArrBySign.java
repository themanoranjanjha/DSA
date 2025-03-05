package TwoPointer;

import java.util.ArrayList;

public class RearrangeArrBySign {
    public static void main(String[] args) {
        int[] arr = {3,1,-2,-5,2,-4};
        int[] ans = rearrangeArray(arr);
        for(int i : ans){
            System.out.print(i+" ");
        }
    
    }
    static int [] rearrangeArray(int [] nums){
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> nev = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
             if (nums[i] > 0) {
                pos.add(nums[i]);
             }else{
                nev.add(nums[i]);
             }
        }
        for (int i = 0; i < nums.length/2; i++) {
            nums[2*i] = pos.get(i);
            nums[2*i+1] = nev.get(i);
        }
        return nums;
    }
}
