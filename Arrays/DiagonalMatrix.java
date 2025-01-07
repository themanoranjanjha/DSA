// Print the left and right diagonals of a matrix.
import java.util.Scanner;

public class DiagonalMatrix {
   public static void main(String[] args) {
    int RC ;
    Scanner obj = new Scanner(System.in);

    System.out.println("Enter the vel of row And Col RC : ");

    RC = obj.nextInt();
    int [][] matrix = new int[RC][RC];
    System.out.println("Enter the element : ");
    for (int i = 0; i < matrix.length; i++) {
        for(int j = 0; j<matrix[0].length; j++){
            matrix[i][j] = obj.nextInt();
        }
    }
    System.out.println("matrix all elements : ");
    for (int i = 0; i < matrix.length; i++) {
        for(int j = 0; j<matrix[0].length; j++){
            System.out.print(matrix[i][j] + " ");
        }
        System.out.println();
    }
    System.out.println("Diagonal Matrix : ");
    for (int i = 0; i < matrix.length; i++) {
        for(int j = 0; j<matrix[0].length; j++){
            if(i==j){
                System.out.print("0" + " ");
            }
            else if(i+j == RC-1){
                System.out.print("0" + " ");
            }
            else{
                System.out.print(matrix[i][j] + " ");
            }
        }
        System.out.println();
    }
   }
    

}
