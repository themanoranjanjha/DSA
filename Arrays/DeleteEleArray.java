import java.util.*;

public class DeleteEleArray {

    public static void main(String[] args) {
    
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int[] newArray = new int[array.length - 1];

        int indexToDelete = 5;

        deleteElement(array, newArray, indexToDelete);
    }
    public static void deleteElement(int[] arr, int[] newArr, int index) {

        
        int e = 0;
        for (int j = 0; j < arr.length; j++) {
            if (j == index) {
                continue;
            } else {
                newArr[e] = arr[j];
                e++;
            }
        }
        System.out.println(" all ekements after deletion" + Arrays.toString(newArr));
        // for (int i = 0; i < newArr.length; i++) {

        //     System.out.print(newArr[i] + " ");
        // }
    }
}