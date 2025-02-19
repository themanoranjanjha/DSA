package Recursion;

public class CopyStr {
    public static void main(String[] args) {
        char[] str = "hello".toCharArray();
        char[] copy = new char[str.length];
        int index = 0;
        copyStr(str, copy, index);
        System.out.println("The copy of the str is " + String.valueOf(copy));
    }
    static void copyStr(char[] str, char[] copy, int index) {
        if (index == str.length) {
            return;
        }
        copy[index] = str[index];
        copyStr(str, copy, index+1);
    }
}
