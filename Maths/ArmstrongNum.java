package Maths;

public class ArmstrongNum {
     private int n;
    public ArmstrongNum(int n){
        this.n = n;
    }
    public boolean isArmstrong(){
        
        int temp = n;
        int ans = 0;
        while(n > 0){
            int rem = n % 10;
            n /= 10;
            ans += rem * rem * rem;
        }
        if(ans == temp){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        int n = 153;
        ArmstrongNum obj = new ArmstrongNum(n);
        if(obj.isArmstrong()){
            System.out.println("The number is an Armstrong number.");
        }else{
            System.out.println("The number is Not an Armstrong number.");
        }
    }

}
