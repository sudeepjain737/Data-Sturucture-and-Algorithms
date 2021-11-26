package Recursion;

public class DecimalToBinary {
    public int dectoBin(int n){
        if(n<0){
            return -1;
        }
        if(n==0){
            return 0;
        }
        return n%2 + 10*dectoBin(n/2);
    }

    public static void main(String[] args) {
        DecimalToBinary d1 = new DecimalToBinary();
        System.out.println(d1.dectoBin(10));
        System.out.println(d1.dectoBin(8));
        System.out.println(d1.dectoBin(-8));
    }
}
