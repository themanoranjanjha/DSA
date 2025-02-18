package Recursion;

public class ReverseStr {
    public static void main(String[] args) {
        String str = "Hello";
        char[] arr = str.toCharArray();
        reverseStr(arr, 0, str.length());
        // System.out.println(reverseStr(arr, 0, arr.length - 1));
    }
    public static void reverseStr(char[] arr, int ind, int n) {
        // if (str.length() == 0) {
        //     return "";
        // }
        // return reverseStr(str.substring(1)) + str.charAt(0);
        if (ind == n) {
            return ;
        }
        char temp = arr[ind];
        reverseStr(arr, ind+1, n);
        System.out.print(temp);
    }
}
