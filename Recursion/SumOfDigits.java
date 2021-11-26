package Recursion;

public class SumOfDigits {
    public int sumofDigits(int n){
        if(n<0){
            return -1;
        }
        if(n==0){
            return 0;
        }
        return n%10 + sumofDigits(n/10);
    }

    public static void main(String[] args) {
        SumOfDigits s1 = new SumOfDigits();
        System.out.println(s1.sumofDigits(2005));
        System.out.println(s1.sumofDigits(12340));

    }
}
