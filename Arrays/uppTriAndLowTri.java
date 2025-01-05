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

        for (int i = 0; i < 3; i++) {
            for(int j=0; j < 3; j++){
                if(i<j){
                  System.out.print("0" + " ");
                }else{
                  System.out.print(matrix[i][j] + " ");
                }
            }
            System.out.println();
        }
       
    }
    
}
