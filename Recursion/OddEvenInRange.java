package Recursion;

public class OddEvenInRange {
    public static void main(String[] args) {
        int start = 1;
        int end = 10;
        System.out.println("Even numbers between " + start + " and " + end + " are: ");
        even(start, end);
        System.out.println();
        System.out.println("Odd numbers between " + start + " and " + end + " are: ");
        odd(start, end);
        
    }
    static void even(int low, int high) {
        if (low > high) {
            return;
        }
        if (low % 2 == 0) {
            System.out.print(low + " ");
        }
        even(low + 1, high);
    }   
    static void odd(int low, int high) {
        if (low > high) {
            return;
        }
        if (low % 2 != 0) {
            System.out.print(low + " ");
        }
        odd(low + 1, high);
    }
}
