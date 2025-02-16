package Recursion;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 10;
        System.out.println("Fibonacci series of " + n + " numbers: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fib(i) + " ");
        }
        
    }
    static int fib(int n) {

        if (n <= 1) {
            return n;              
        }
        else{
            return fib(n - 1) + fib(n - 2);
        }
       
    }
}
