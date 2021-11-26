package Arrays;

public class MaxMinElement {
    public void maxMinEle(int[] arr){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("MINIMUM = " + min + " MAXIMUM = " + max);
    }

    public static void main(String[] args) {
        MaxMinElement m1 = new MaxMinElement();
        m1.maxMinEle(new int[]{1,2,3,4,5,6});
    }
}
