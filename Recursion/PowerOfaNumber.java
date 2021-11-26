package Recursion;

public class PowerOfaNumber {
    public int power(int n, int x){
        if(n<0){
            return -1;
        }
        if(n==0){
            return 1;
        }
        return x*power(n-1,x);
    }

    public static void main(String[] args) {
        PowerOfaNumber p1 = new PowerOfaNumber();
        System.out.println(p1.power(4,10));
        System.out.println(p1.power(0,5));
        System.out.println(p1.power(-2,5));
    }
}
