package Arrays;

public class ArrayTraversal {
    int[] arr;
    public void array(){
        arr = new int[]{1,2,3,4,5};
    }
    public void arrayTraversal(){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        ArrayTraversal a1 = new ArrayTraversal();
        a1.array();
        a1.arrayTraversal();
    }
}
