import java.util.Scanner;

public class IdentityMetrix {

    public boolean isIdentityMatrix(int[][] matrix) {
        int n = matrix.length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i == j && matrix[i][j] != 1){
                    return false;
                }
                if(i != j && matrix[i][j] != 0){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int n ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the matrix");
        n = sc.nextInt();
        int[][] matrix = new int[n][n];
        System.out.println("Enter the elements of the matrix");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("The matrix is : ");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        IdentityMetrix obj = new IdentityMetrix();

        if(obj.isIdentityMatrix(matrix)){
            System.out.println("The matrix is an identity matrix");
        }
        else
        {
            System.out.println("The matrix is not an identity matrix");
        }
        
    }
    
}
