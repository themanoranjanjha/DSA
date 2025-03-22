public class SortColors {
    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};
        sortColors(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    static void sortColors(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int i = 0;
        while (i <= end) {
            if(nums[i] == 0){
                swap(nums, i, start);
                start++;
                i++;
            }
            else if(nums[i] == 2){
                swap(nums, i, end);
                end--;
            }
            else{
                i++;
            }
        }
    }
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
