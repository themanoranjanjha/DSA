// Find the maximum and minimum values in each column of a matrix.
import java.util.Arrays;
import java.util.Scanner;
public class MaxMinEchCol {
    public static void main(String[] args) {
        // int[][] matrix = { {8, 4, 5}, {7, 9, 7} , {4, 1, 9}};
        int R, C;
        Scanner ref = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        R = ref.nextInt();
        System.out.println("Enter the number of columns: ");
        C = ref.nextInt();

        int[][] matrix = new int[R][C];

        System.out.println("Enter the elements of the matrix: ");
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                matrix[i][j] = ref.nextInt();
            }
        }

        System.out.println("all Elements of the Arrays is : ");
        for (int i = 0; i < R; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
        System.out.println();
        
        int[][] result = findMaxMin(matrix);
        for (int i = 0; i < result.length; i++) {
            System.out.println(Arrays.toString(result[i]));
        }
    }

    public static int[][] findMaxMin(int[][] matrix) {
        int[][] result = new int[matrix[0].length][2];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[j][i] > max) {
                    max = matrix[j][i];
                    result[i][0] = max; 
                }
                if (matrix[j][i] < min) {
                    min = matrix[j][i];
                    result[i][1] = min;
                }  
            }
            max = Integer.MIN_VALUE;
            min = Integer.MAX_VALUE;
        }
        return result;
    }

}
