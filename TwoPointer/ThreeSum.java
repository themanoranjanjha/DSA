package TwoPointer;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        int[] res = threeSum(nums);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
    static int[] threeSum(int[] nums){
        int n = nums.length;
        int[] res = new int[3];
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n-2; i++) {
            for (int j = i+1; j < n-1; j++) {
                for (int k = j+1; k < n; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        if (Math.abs(nums[i] + nums[j] + nums[k]) < min) {
                            min = Math.abs(nums[i] + nums[j] + nums[k]);
                            res[0] = nums[i];
                            res[1] = nums[j];
                            res[2] = nums[k];
                        }
                    }
                }
            }
        }
        return res;
    }
}
