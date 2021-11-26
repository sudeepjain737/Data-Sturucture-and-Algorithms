package Arrays;

public class MaximumSumSubarray {
    public void subArray(int[] arr){
        int c = 0;
        int s = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] <= c+arr[i]){
                c = c+arr[i];
            }
            else{
                c = arr[i];
            }
            if(s < c){
                s = c;
            }
        }
        System.out.println(s);
    }

    public static void main(String[] args) {
        MaximumSumSubarray m1 = new MaximumSumSubarray();
        m1.subArray(new int[]{-1,2,3,5,-4,3,5});
    }
}
