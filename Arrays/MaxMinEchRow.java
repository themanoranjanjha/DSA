// Find the maximum and minimum values in each row of a matrix.

import java.util.Arrays;

public class MaxMinEchRow {
    public static void main(String[] args) {
   
        int[][] matrix = { {8, 4, 5, 6, 1}, {7, 9, 7, 3, 12}};
        
         int[][] result = findMaxMin(matrix);
         for (int i = 0; i < result.length; i++) {
            System.out.println(Arrays.toString(result[i]));
         }   
    }
    
    public static int[][] findMaxMin(int[][] matrix) {
        int[][] result = new int[matrix.length][2];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < matrix.length; i++) {
          
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    result[i][0] = max; 
                }
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                    result[i][1] = min;
                }  
            }
            max = Integer.MIN_VALUE;
            min = Integer.MAX_VALUE;
        }
        return result;

    }
}
