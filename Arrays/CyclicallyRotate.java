package Arrays;

public class CyclicallyRotate {
    public void rotate(int[] arr, int n){
        int n1 = n;
        if(n > arr.length){
            n = n%arr.length;
        }
        for (int k = 0; k < n; k++){
            int j = arr[arr.length-1];
            for (int i = arr.length-1; i > 0 ; i--) {
                    arr[i] = arr[i-1];
                }
            arr[0] = j;
        }
        System.out.print("Array after cyclically rotate by " + n1 + " is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        CyclicallyRotate c1 = new CyclicallyRotate();
        c1.rotate(new int[]{1,2,3,4,5},2);
    }
}
