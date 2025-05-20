package Recursion;

public class CheckPrime {
    public static void main(String[] args) {
        int n = 15;
       
        if (isPrime(n, 2) == 1) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");  
        }
    }
   static int isPrime(int n, int i) {
        if (n <= 2) {
            return (n == 2) ? 1 : 0;
        }
        if (n % i == 0) {
            return 0;
        } 
        if (i * i > n) {
            return 1;
        }
        return isPrime(n, i + 1);
    }
}
