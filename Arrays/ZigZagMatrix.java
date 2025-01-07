import java.util.Arrays;
import java.util.Scanner;


public class ZigZagMatrix {

    public void PrintZigZag(int mat[][], int r, int c ){
        int evenRow = 0;
        int oddRow = 1;

        while (evenRow < r) {
              for (int i = 0; i < c; i++) {
                  System.out.print(mat[evenRow][i] + " ");
              }
            System.out.println();
              evenRow = evenRow+2;

              if (oddRow < r) {
                for (int i = c-1; i >= 0; i--) {
                    System.out.print(mat[oddRow][i] + " ");
                }
              }
              System.out.println();
              oddRow = oddRow+2;
        }


    }

    public static void main(String[] args) {
        int row, col;
    
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter velue of Row : ");
        row = obj.nextInt();
        System.out.println("Enter velue of col : ");
        col = obj.nextInt();
        int [][] mat = new int[row][col];
        System.out.println("Enter Array Element : ");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                   mat[i][j] = obj.nextInt();
            }
        }
        System.out.println("printing Array elements : 2");
        for (int i = 0; i < mat.length; i++) {
            System.out.println(Arrays.toString(mat[i]));
        }
       ZigZagMatrix ref =new ZigZagMatrix();
        System.out.println("printing Zig Zag elements :");
       ref.PrintZigZag(mat, row, col); 

        
    }
}
