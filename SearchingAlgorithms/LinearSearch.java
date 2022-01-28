package SearchingAlgorithms;

public class LinearSearch {
    public void search(int arr[],int value){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == value){
                System.out.println("Value Founded on Index: " + i);
                return;
            }
        }
        System.out.println("Value Not Found");
    }

    public static void main(String[] args) {
        LinearSearch l = new LinearSearch();
        int arr[] = {1,2,3,4,5,-3,-2,0};
        l.search(arr,5);
        l.search(arr,9);
    }
}
