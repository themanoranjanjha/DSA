// 2161. Partition Array According to Given Pivot


public class PatritionArrPivot {
    public static void main(String[] args) {
        int[] arr = {-3,4,3,2};
        int pivot = 2;
        int [] ans = partition(arr, pivot);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
    static int[] partition(int [] arr, int pivot){
        
        int [] ans = new int[arr.length];
        int start = 0;
        int end = arr.length - 1;
       for (int i = 0, j = arr.length-1; i < ans.length; i++,j--) {
            if(arr[i] < pivot){
                ans[start] = arr[i];
                start++;
            }
            if(arr[j] > pivot){
                ans[end] = arr[j];
                end--;
            }
        }
        while (start <= end) {
            ans[start] = pivot;
            start++;
            
        }
        return ans;
       }   
}
