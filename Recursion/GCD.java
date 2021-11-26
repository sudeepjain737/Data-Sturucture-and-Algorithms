package Recursion;

public class GCD {
   public int gcd(int m, int n){
        if(n<0 || m<0){
            return -1;
        }
        if(n-m == 0){
            return n;
        }

        return gcd(Math.abs(m-n),Math.min(m,n));
    }

    /*
    public int gcd(int m, int n){
        if(n<0 || m<0){
            return -1;
        }
        if(n == 0){
            return m;
        }

        return gcd(n,m%n);
    }
    */


    public static void main(String[] args) {
        GCD g1 = new GCD();
        System.out.println(g1.gcd(56,98));
        System.out.println(g1.gcd(4,8));
    }
}
