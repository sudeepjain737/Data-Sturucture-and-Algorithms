package SearchingAlgorithms;

//            Only applicable on "SORTED" Arrays

public class JumpSearch {
    public void search(int arr[],int value){
        int k = (int) Math.sqrt(arr.length);
        int s = k;
        while (k <= arr.length-1 && arr[k] < value){
            k = k + s;
        }
        for (int i = k-s; i <= k ; i++) {
            if(arr[i] == value){
                System.out.println("Value Founded on Index: " + i);
                return;
            }
        }
        System.out.println("Value Not Founded");
    }

    public static void main(String[] args) {
        JumpSearch j = new JumpSearch();
        int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12,14,15};
        j.search(arr,11);
        j.search(arr,0);
    }
}
