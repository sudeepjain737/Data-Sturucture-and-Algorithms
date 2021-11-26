/*
Find missing number between 1 to 10
 */
package Arrays;

public class MissingNumbers {
    int arr[] = new int[]{1,2,3,4,5,6,7,9,10};
    int s = 0;
    public void missingNumber(){
        for (int i = 0; i < arr.length; i++) {
            s = s + arr[i];
        }
        int n = 10;
        int sum = n*(n+1)/2;
        System.out.println(sum - s);
    }

    public static void main(String[] args) {
        MissingNumbers m1 = new MissingNumbers();
        m1.missingNumber();
    }
}
