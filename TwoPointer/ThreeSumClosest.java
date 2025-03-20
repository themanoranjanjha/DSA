import java.util.Arrays;

public class ThreeSumClosest {
    public static void main(String[] args) {
        int[] nums = {-1, 2, 1, -4};
        int target = 1;
        int res = threeSumClosest(nums, target);
        System.out.println(res);
    }
    static int threeSumClosest(int[] nums, int target){
        int sum = 0;
        int res = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i=0; i < nums.length; i++){
            int start = i+1;
            int end = nums.length-1;
            while(start < end){
                sum = nums[i] + nums[start] + nums[end];
                if(Math.abs(sum - target) < Math.abs(target - res)){
                    res = sum;
                }else if(sum < target){
                    start++;
                }else{
                    end--;
                }
            }  
        }
        return res;
    }
}
