package SearchingAlgorithms;

//            Only applicable on "SORTED" Arrays

public class BinarySearch {
    public void search(int arr[],int value){
        int start = 0;
        int end = arr.length-1;
        int mid = (start + end)/2;
        while (arr[mid] != value && start <= end){
            if(arr[mid] > value){
                end = mid-1;
            }
            else {
                start = mid+1;
            }
            mid = (start + end)/2;
        }
        if(arr[mid] == value) {
            System.out.println("Value Founded on Index: " + mid);
        }
        else {
            System.out.println("Value Not Found");
        }
    }

    public static void main(String[] args) {
        BinarySearch b = new BinarySearch();
        int arr[] = {-2,-1,0,1,2,3,4,5,6};
        b.search(arr,3);
        b.search(arr,10);
    }
}
