package Sorting;

public class SelectionSort {
    public int[] sort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int minimum = Integer.MAX_VALUE;
            int minimumIndex = -1;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < minimum) {
                    minimum = arr[j];
                    minimumIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minimumIndex];
            arr[minimumIndex] = temp;
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
        int arr[] = {-2,1, 2, 6, -1, 0, 5, 34};
        obj.print(obj.sort(arr));
    }
}
