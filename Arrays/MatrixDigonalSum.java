public class MatrixDigonalSum {
    
    public static int DigonalSum( int arr[][]){
        
        int n = arr.length;
        int sum = 0;
        for(int i=0; i<n; i++){
            sum += arr[i][i];
            sum += arr[i][n-i-1];
        }
        if(n%2 != 0){
            sum -= arr[n/2][n/2];
        }
       return sum;
    }
    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        
        System.out.println("Matrix Digonal Sum " + DigonalSum(mat));
    }
    
}
