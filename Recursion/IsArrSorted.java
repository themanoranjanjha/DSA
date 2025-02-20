package Recursion;

public class IsArrSorted {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(isArrSorted(arr, 0));
    }
    static boolean isArrSorted(int[] arr, int index) {
        if (index == arr.length-1) {
            return true;
        }
        return arr[index] < arr[index+1] && isArrSorted(arr, index+1);
    }
}
