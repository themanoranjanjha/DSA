// Print the boundary elements of a matrix.   
import java.util.Scanner;
public class BoundaryElement {
    public static void main(String[] args) {
        int rc;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the vel of row And Col RC : ");
        rc = obj.nextInt();
        int [][] matrix = new int[rc][rc];
        System.out.println("Enter the value of Array Elements : ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = obj.nextInt();
            }
        }

        System.out.println("printing  the boundary Elements of a Matrix");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(i==0 || j==0 || i == rc-1 || j == rc-1 ){
                    System.out.print(matrix[i][j] + " ");
                }
                else{
                    System.out.print("  ");
                }      
            }
            System.out.println();
        }
    }
    
}