public class Cyclic {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 3, 2, 4 };
        cyclicSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    static void cyclicSort(int[] num){
        int i = 0;
        while(i< num.length){
            int correct = num[i] - 1;
            if (num[i] != num[correct]) {
                int temp = num[i];
                num[i] = num[correct];
                num[correct] = temp;
            }
            else{
                i++;
            }
        }

    }
}