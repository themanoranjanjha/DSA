package Maths;

import java.util.Scanner;

public class PalindromeNo {
    public boolean isPalindrome(int n){
        int temp = n;
        int ans = 0;
        while(n > 0){
            int rem = n % 10;
            n /= 10;
            ans = ans * 10 + rem;
        }
        if(ans == temp){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        n = sc.nextInt();
        PalindromeNo obj = new PalindromeNo();
        if(obj.isPalindrome(n)){
            System.out.println("The number is a palindrome.");
        }else{
            System.out.println("The number is Not a palindrome.");
        }
       

    }
}
