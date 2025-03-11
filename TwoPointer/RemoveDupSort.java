

public class RemoveDupSort {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,3,4,4,5,5};
        int ans = removeDup(arr);
        System.out.println(" All unique Elements " + ans);
    }
    static int removeDup(int [] nums){
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
