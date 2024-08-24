/**
 * CellsOddValues
 */
public class CellsOddValues {

    public int oddCells(int n, int m, int[][] indices) {
        int[][] matrix = new int[n][m];
        int count = 0;
        for (int[] index : indices) {
            int ri = index[0];
            int ci = index[1];
            for (int j = 0; j < m; j++) {
                matrix[ri][j]++;
            }
            for (int i = 0; i < n; i++) {
                matrix[i][ci]++;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] % 2 == 1) {
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        CellsOddValues cellsOddValues = new CellsOddValues();
        int[][] indices = {{0,1},{1,1}};
        System.out.println(cellsOddValues.oddCells(2, 3, indices));
        
    
    }
}