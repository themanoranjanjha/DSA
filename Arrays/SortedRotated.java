package Arrays;

/**
 * CheckArraySortedRotated
 */
public class SortedRotated {

    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2};
        System.out.println("Anas is true or false " + check(arr));
        }
        public static boolean check(int[] nums) {
           // here we compare all the neighbouring elemnts and check whether they are in   somewhat sorted
          // there will be a small change due to rotation in the array at only one place.
          // so if there are irregularities more than once, return false

           int irregularities = 0;
           int length = nums.length;
           for (int i=0; i<length; i++) {
               if (nums[i] > nums[(i + 1) % length])
                   irregularities += 1;
           }
           return irregularities > 1 ? false : true;
       }    

}
