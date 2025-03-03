package TwoPointer;

public class SortArrByPari {
    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 4};
        int[] res = sortArrayByParity(nums);
        for (int n : res) {
            System.out.print(n + " ");
        }
    }
    static int[] sortArrayByParity(int[] nums) {
        int i = 0, j = nums.length - 1;
        while (i < j) {    
            if (nums[i] % 2 == 0){
                i++;
            } 
            else{
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
                j--;
            } 
        }
        return nums;
    }
}
