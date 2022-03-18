package Sorting;

public class QuickSort {
    public int partition(int arr[],int left, int right){
        int pivot = right;
        int i = left - 1;
        for (int j = left; j <= right ; j++) {
            if(arr[j] <= arr[pivot]) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        return i;
    }

    public void quickSort(int arr[],int left,int right){
        if(left < right){
            int pivot = partition(arr,left,right);
            quickSort(arr,left,pivot-1);
            quickSort(arr,pivot+1,right);
        }
    }

    public void display(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        MergeSort obj = new MergeSort();

        int arr1[] = {-90,1,2,6,3,4,1,2,3,4,-3,-1,0,4,0};
        obj.mergeSort(arr1,0,arr1.length-1);
        obj.display(arr1);
    }
}

