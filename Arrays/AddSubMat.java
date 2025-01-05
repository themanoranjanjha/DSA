// Add and subtract two matrices.
import java.util.Arrays;
import java.util.Scanner;

public class AddSubMat {
    public static void main(String[] args) {
        int[][] mat1 = new int[2][2];
        int [][] mat2 = new int[2][2];
        int [][] Add = new int [2][2];
        Scanner obj = new Scanner(System.in);
        System.out.println("enter element in 1st Array :");
        for(int i = 0; i<2; i++){
            for(int j =0; j<2; j++){
                mat1[i][j] = obj.nextInt();
            }
        }
        System.out.println("enter element in 2nd Array :");
        for(int i = 0; i<2; i++){
            for(int j =0; j<2; j++){
                mat2[i][j] = obj.nextInt();
            }
        }
        System.out.println("All eements of Array  Mat1 : ");
        for (int i = 0; i < 2; i++) {
               System.out.println(Arrays.toString(mat1[i]));   
        }
        System.out.println("All eements of Array  Mat1 : ");
        for (int i = 0; i < 2; i++) {
            System.out.println( Arrays.toString(mat2[i]));   
       }

    //    Adding to Array Element 
       for(int i = 0; i<2; i++){
        for(int j = 0; j<2; j++){
            Add[i][j] = mat1[i][j] + mat2[i][j];
         }
       }
       System.out.println("preanting Array After add operation : ");
         for(int i = 0; i<2; i++){
            System.out.println(Arrays.toString(Add[i]));
         }
        //  Arrays.fill(Add, 0);
        for (int[] row: Add)
               Arrays.fill(row, 0);

         for(int i = 0; i<2; i++){
            for(int j = 0; j<2; j++){
                Add[i][j] = mat1[i][j] - mat2[i][j];
             }
           }
        System.out.println("preanting Array After Subtract operation : ");
        for(int i = 0; i<2; i++){
              System.out.println(Arrays.toString(Add[i]));
           }   
    }
}
