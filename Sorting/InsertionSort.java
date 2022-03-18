package Sorting;

public class InsertionSort {
    public int[] sort(int arr[]){
        for (int i = 1; i < arr.length; i++){
            int j = i;
            while (j >= 0){
                if(arr[j-1] > arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    j--;
                }
            }
        }
        return arr;
    }
    public void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        BubbleSort obj = new BubbleSort();
        int arr[] = {-2,1, 2, 6, 90,-1, 0, 5, 34};
        obj.print(obj.sort(arr));
    }
}
