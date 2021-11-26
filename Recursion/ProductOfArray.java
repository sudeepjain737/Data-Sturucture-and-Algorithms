package Recursion;

public class ProductOfArray {
    public int productOfArray(int[] arr ,int n){
        if(n<0){
            return -1;
        }
        if(n==0){
            return 1;
        }
        return arr[n-1]*productOfArray(arr,n-1);
    }

    public static void main(String[] args) {
        ProductOfArray p1 = new ProductOfArray();
        System.out.println(p1.productOfArray(new int[]{2, 2, 3, 5},4));
    }
}
