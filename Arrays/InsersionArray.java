public class InsersionArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5,
            6, 7, 8, 9, 10};
            int[] array2 = new int[array.length + 1];
            int index = 3;
            int element = 100; 
             insertEle(array, array2, index, element);
     }

     public static void insertEle( int[] arr, int[] newArr, int index, int element ){
        int e =0;
        for(int j=0; j<newArr.length; j++){
           
            if(j==index) {    
                newArr[j] = element;    
                }else {    
                newArr[j] = arr[e];    
                e++; 
                }  
        }
        for(int i=0; i<newArr.length; i++){
            System.out.print(newArr[i] + " ");
        }
         
     }
}
