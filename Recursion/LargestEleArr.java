package Recursion;

public class LargestEleArr {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 4, 3, 2, 1};
        System.out.println(largestEle(arr, 0));
    }

    public static int largestEle(int[] arr, int index) {
        if (index == arr.length - 1) {
            return arr[index];
        }
        int max = largestEle(arr, index + 1);
        return Math.max(max, arr[index]);
    }
}
