package Arrays;

import BigONotation.Pairs;

public class PairsOfTwoSums {
    int [] arr = new int[]{1,2,3,4,5,6,7};
    public void findSum(int n){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]+arr[j] == n){
                    System.out.println(i + " " + j);
                }
            }
        }
    }

    public static void main(String[] args) {
        PairsOfTwoSums p1 = new PairsOfTwoSums();
        p1.findSum(9);
    }
}
