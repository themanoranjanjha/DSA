package Recursion;

public class PrintArrEle {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        printArrEle(arr, 0);
    }
    static void printArrEle(int[] arr, int index) {
        if (index == arr.length) {
            return;
        }
        System.out.print(arr[index] + " ");
        printArrEle(arr, index + 1);
    }
}
