public class MaxEle {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 2, 8, -1, 4};
        int max = findMax(arr);
        System.out.println("The maximum element in the array is: " + max);
    }

    public static int findMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
