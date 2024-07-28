public class FlippImage {
    public static void main(String[] args) {
        int[][] image = {{1,1,0},{1,0,1},{0,0,0}};
        int[][] result = flipAndInvertImage(image);
        
        for (int[] row : result) {
            for (int pixel : row) {
                System.out.print(pixel + " ");
            }
            System.out.println();
        }
    }

    public static int [][] flipAndInvertImage(int[][] image){
        int n = image.length;
        for(int[] row : image){
            for(int i = 0; i < (n+1)/2; i++){
                int temp = row[i] ^ 1;
                row[i] = row[n-1-i] ^ 1;
                row[n-1-i] = temp;
            }
        }
        return image;
    
    }
}
