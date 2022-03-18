package Sorting;

public class MergeSort {
    public void merge(int arr[] , int left,int mid,int right){
        int temp1[] = new int[mid - left + 2];
        int temp2[] = new int[right - mid + 1];
        for (int i = 0; i < mid - left + 1; i++) {
            temp1[i] = arr[left + i];
        }
        for (int i = 0; i < right - mid; i++) {
            temp2[i] = arr[mid + i + 1];
        }

        temp1[mid - left + 1] = Integer.MAX_VALUE;
        temp2[right - mid] = Integer.MAX_VALUE;

        int i = 0;
        int j = 0;
        for (int k = left; k < right + 1 ; k++) {
            if(temp1[i] <= temp2[j]){
                arr[k] = temp1[i];
                i++;
            }
            else{
                arr[k] = temp2[j];
                j++;
            }
        }
    }

    public void mergeSort(int arr[] , int left, int right){
        if(left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr,left,mid);
            mergeSort(arr,mid + 1, right);
            merge(arr,left,mid,right);
        }
    }

    public void display(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        MergeSort obj = new MergeSort();

        int arr1[] = {1,2,6,3,4,1,2,3,4,-3,-1,0,4,0};
        obj.mergeSort(arr1,0,arr1.length-1);
        obj.display(arr1);
    }
}
