package Arrays;

public class ArrayReversal {
    public void reverse(int arr[]) {
        int j = arr.length-1;
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j = j - 1;
        }
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
    }
    public static void main(String[] args) {
        ArrayReversal a1 = new ArrayReversal();
        a1.reverse(new int[]{1,2,3,4,5});
    }
}
