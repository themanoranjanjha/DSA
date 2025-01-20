package Maths;

public class trailingZero {
    public static void main(String[] args) {
        int n = 25;
        System.out.println("Trailing Zeroes in " + n + " is: " + trailingZeroes(n));
    }

    public static int trailingZeroes(int n) {

        if (n < 0) {
            return -1;
        }
        int count = 0;
        while (n > 0) {
            n = n / 5;
            count += n;
        }
        return count;
    }
}
