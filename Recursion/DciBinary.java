package Recursion;

public class DciBinary {
    public static void main(String[] args) {
        int n = 10;
        
        System.out.println("Binary of " + n + " is: " + find(n));
    }
    public static int find(int decimal_number) {
        {
            if (decimal_number == 0) 
                return 0; 
                 
            else
             
            return (decimal_number % 2 + 10 * 
                    find(decimal_number / 2));
        }
        
    }
   
}
