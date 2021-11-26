package Recursion;

public class RangeSum {
    public int rangeSum(int n) {
        if(n<0){
            return -1;
        }
        if(n==0){
            return 0;
        }
        return n + rangeSum(n-1);
    }

    public static void main(String[] args) {
        RangeSum a1 = new RangeSum();
        System.out.println(a1.rangeSum(6));
    }
}

