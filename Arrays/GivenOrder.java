public class GivenOrder {
      
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];
		int count = 0;
		while (count < target.length) {
            if (index[count] >= count) {
				target[index[count]] = nums[count];
			}
            else{
				for (int i = target.length - 1; i > index[count]; i--)
					target[i] = target[i - 1];
				target[index[count]] = nums[count];
			}
			count++;
		}
        return target;
        
    }

    public static void main(String[] args) {
        GivenOrder go = new GivenOrder();
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        int[] target = go.createTargetArray(nums, index);   
        for (int i : target) {
            System.out.print(i + " ");
        }

    }
}
