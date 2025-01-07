// Print the upper triangle and lower triangle of a matrix.
import java.util.Arrays;
import java.util.Scanner;

public class uppTriAndLowTri {
    public static void main(String[] args) {
        int [][] matrix = new int[3][3];
       
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the Array Element.");
        for (int i = 0; i < 3; i++) {
            for(int j=0; j < 3; j++){
                matrix [i][j] = obj.nextInt();
            }
        }
        System.err.println("matrix all elements : ");
        for (int i = 0; i < matrix.length; i++) {
             System.out.println(Arrays.toString(matrix[i]));
        }
        System.out.println("Upper And Lower  Triangle : ");
        for (int i = 0; i < 3; i++) {
            for(int j=0; j < 3; j++){
                if(i<j){
                  System.out.print("0" + " ");
                }
                else if (i>j) {
                    System.out.print("0" + " ");
                }
                else{
                  System.out.print(matrix[i][j] + " ");
                }
            }
            System.out.println();
        }
        // System.out.println("Lower Triangle : ");
        // for (int i = 0; i < matrix.length; i++) {
        //     for(int j = 0; j<matrix[0].length; j++){
        //         if(i>j){
        //             System.out.print("0" + " ");
        //           }else{
        //             System.out.print(matrix[i][j] + " ");
        //           }
        //     }
        //     System.out.println();
        // }

       
    }
    
}
