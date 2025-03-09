package TwoPointer;
// 2200. Find All K-Distant Indices in an Array
public class ApplyOperArr {
    public static void main(String[] args) {
        int[] arr = {1,2,2,1,1, 0};
        int [] res = applyOperation(arr);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
    static int [] applyOperation(int [] nums){

        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == nums[i + 1]) {
                nums[i] *= 2;
                nums[i + 1] = 0;   
            }
        }

        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index++] = nums[i];
            }
        }
        while (index < nums.length) {
            nums[index++] = 0;
        }
        return nums;
    }
}
