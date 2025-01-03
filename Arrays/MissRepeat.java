public class MissRepeat {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 1, 5};
        int[] result = findTwoElement(arr);
        System.out.println("Duplicate: " + result[0] + ", Missing: " + result[1]);
    }

    public static int[] findTwoElement(int[] arr) {
        int n = arr.length;
        int i = 0;
        
        // Loop through the array to place each element at its correct position
        while (i < n) {
            // Check if the current element is not in its correct position
            // and if it is not a duplicate of the element at its correct position
            if (arr[i] != arr[arr[i] - 1]) {
                int temp = arr[arr[i] - 1];
                arr[arr[i] - 1] = arr[i];
                arr[i] = temp;
            } else {
                i++;
            }
        }

        // Array to store the result: result[0] is the duplicate and result[1] is the missing number
        int[] result = new int[2];
        
        // Iterate through the array to find the duplicate and the missing element
        for (int j = 0; j < n; j++) {
            if (arr[j] != j + 1) {
                result[0] = arr[j];   // Duplicate element
                result[1] = j + 1;    // Missing element
            }
        }

        return result;
    }
}
