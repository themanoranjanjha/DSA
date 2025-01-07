import java.util.Arrays;
import java.util.Scanner;

public class SortRCmatrix {
    static void sortByRow(int mat[][], int n){
        for (int i = 0; i < n; i++) {
            Arrays.sort(mat[i]);
        }
    }
    static void transpose(int mat[][], int n){
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
    }
    static void sortMatRowAndColWise(int mat[][],int n)
    {
        // sort rows of mat[][]
        sortByRow(mat, n);
     
        // get transpose of mat[][]
        transpose(mat, n);
     
        // again sort rows of mat[][]
        sortByRow(mat, n);
     
        // again get transpose of mat[][]
        transpose(mat, n);
    }
    
    static void printMat(int mat[][], int n)
    {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(mat[i][j] + " ");
            System.out.println();
        }
    } 
    public static void main(String[] args) {
        
         Scanner obj = new Scanner(System.in);
         int rc = obj.nextInt();
         int [][] matrix = new int[rc][rc];
         for (int i = 0; i < rc; i++) {
            for (int j = 0; j < rc; j++) {
                matrix[i][j] = obj.nextInt();
            }
         }
         System.out.print("Original Matrix:\n");
         printMat(matrix, rc);
         sortMatRowAndColWise(matrix, rc);
         System.out.print("\nMatrix After Sorting:\n");
        printMat(matrix, rc);

    }
}
