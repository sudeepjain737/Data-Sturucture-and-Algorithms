package SearchingAlgorithms;

public class LinearSearchByRecursion {
    public void search(int arr[],int start,int end,int value){
        if(start > end){
            System.out.println("Value not Found");
            return;
        }
        if(arr[start] == value){
            System.out.println("Value Found on Index: " + start);
            return;
        }
        if(arr[end] == value){
            System.out.println("Value Found on Index: " + end);
            return;
        }
        search(arr,start+1,end-1,value);
    }

    public static void main(String[] args) {
        LinearSearchByRecursion l = new LinearSearchByRecursion();
        int arr[] = {1,2,10,5,-3,-6,3,0,-1};
        l.search(arr,0,arr.length-1,11);
        l.search(arr,0,arr.length-1,0);
    }
}
