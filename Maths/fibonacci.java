package Maths;

public class fibonacci {
    public static void main(String[] args) {
        // int n = 10;
        // int a = 0;
        // int b = 1;
        // // System.out.print("fibonacci series: ");
        // for(int i = 0; i < n; i++){
           
        //     System.out.print(a + " ");
        //     int c = a + b;
        //     a = b;
        //     b = c;
        // }

        // using recursion
        int n = 10;
        for(int i = 0; i < n; i++){
            System.out.print(fib(i) + " ");
        }
        
    }
    public static int fib(int n){
        if(n <= 1){
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }
}
