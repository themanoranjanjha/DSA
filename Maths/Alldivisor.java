package Maths;

public class Alldivisor {
    public static void main(String[] args) {
        int n = 15;
        int res [] = new int[n];

        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                res[count++] = i;
            }
        }
        System.out.println("All Divisors of " + n + " are: ");
        for (int i = 0; i < count; i++) {
            System.out.println(res[i]);
        }
        
    
    }

}
