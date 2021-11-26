package Recursion;

public class Fibonacci {
    public int fibonacci(int n){
        if(n<0){
            return -1;
        }
        if(n==0 || n==1){
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main(String[] args) {
        Fibonacci f1 = new Fibonacci();
        System.out.println(f1.fibonacci(3));
        System.out.println(f1.fibonacci(5));
        System.out.println(f1.fibonacci(0));
        System.out.println(f1.fibonacci(-2));
    }
}
