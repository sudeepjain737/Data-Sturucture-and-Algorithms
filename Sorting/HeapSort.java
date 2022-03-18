package Sorting;

public class HeapSort {
    public void heapSort(int arr[]){
        BinaryHeap obj = new BinaryHeap(arr.length);
        for (int i = 0; i < arr.length; i++) {
            obj.insert(arr[i],"Min");
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = obj.extract("Min");
        }
    }

    public void display(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        HeapSort obj = new HeapSort();
        int arr[] = {-7,3,5,-9,3,0,-3,2,1,4,5};
        obj.heapSort(arr);
        obj.display(arr);
    }
}

class BinaryHeap{
    int binaryHeap[];
    int sizeOfHeap;
    BinaryHeap(int size){
        sizeOfHeap = 0;
        binaryHeap = new int[size+1];
    }

    public boolean isEmpty(){
        if(sizeOfHeap == 0){
            return true;
        }
        return false;
    }

    public boolean isFull(){
        if(sizeOfHeap == binaryHeap.length-1){
            return true;
        }
        return false;
    }

    public void heapifyBottomToTop(int childIndex,String type){
        int parentIndex = childIndex/2;
        if(childIndex <= 1){
            return;
        }
        if(type.equals("Min")){
            if(binaryHeap[childIndex] < binaryHeap[parentIndex]){
                int temp = binaryHeap[parentIndex];
                binaryHeap[parentIndex] = binaryHeap[childIndex];
                binaryHeap[childIndex] = temp;
            }
        }
        else if(type.equals("Max")){
            if(binaryHeap[childIndex] > binaryHeap[parentIndex]){
                int temp = binaryHeap[parentIndex];
                binaryHeap[parentIndex] = binaryHeap[childIndex];
                binaryHeap[childIndex] = temp;
            }
        }
        heapifyBottomToTop(parentIndex,type);
    }

    public void insert(int value,String type){
        if(isFull()){
            System.out.println("Binary Heap is Full!!!!!!");
            return;
        }
        else {
            sizeOfHeap++;
            binaryHeap[sizeOfHeap] = value;
            heapifyBottomToTop(sizeOfHeap,type);
        }
    }

    public void heapifyTopToBottom(int parentIndex,String type){
        int leftChildIndex = 2 * parentIndex;
        int rightChildIndex = (2 * parentIndex) + 1;
        int swapNode = 0;
        if(leftChildIndex > sizeOfHeap){
            return;
        }
        if(type.equals("Min")){
            if(leftChildIndex == sizeOfHeap){
                if(binaryHeap[leftChildIndex] < binaryHeap[parentIndex]){
                    int temp = binaryHeap[parentIndex];
                    binaryHeap[parentIndex] = binaryHeap[leftChildIndex];
                    binaryHeap[leftChildIndex] = temp;
                }
                return;
            }
            else {
                if(binaryHeap[leftChildIndex] > binaryHeap[rightChildIndex]){
                    swapNode = rightChildIndex;
                }
                else {
                    swapNode = leftChildIndex;
                }
                if(binaryHeap[swapNode] < binaryHeap[parentIndex]){
                    int temp = binaryHeap[swapNode];
                    binaryHeap[swapNode] = binaryHeap[parentIndex];
                    binaryHeap[parentIndex] = temp;
                }
            }
        }
        else if(type.equals("Max")){
            if(leftChildIndex == sizeOfHeap){
                if(binaryHeap[leftChildIndex] > binaryHeap[parentIndex]){
                    int temp = binaryHeap[parentIndex];
                    binaryHeap[parentIndex] = binaryHeap[leftChildIndex];
                    binaryHeap[leftChildIndex] = temp;
                }
                return;
            }
            else {
                if(binaryHeap[leftChildIndex] < binaryHeap[rightChildIndex]){
                    swapNode = rightChildIndex;
                }
                else {
                    swapNode = leftChildIndex;
                }
                if(binaryHeap[swapNode] > binaryHeap[parentIndex]){
                    int temp = binaryHeap[swapNode];
                    binaryHeap[swapNode] = binaryHeap[parentIndex];
                    binaryHeap[parentIndex] = temp;
                }
            }
        }
        heapifyTopToBottom(swapNode,type);
    }

    public Integer extract(String type){
        if(isEmpty()){
            return null;
        }
        else {
            int val = binaryHeap[1];
            binaryHeap[1] = binaryHeap[sizeOfHeap];
            sizeOfHeap--;
            heapifyTopToBottom(1,type);
            return val;


        }
    }
}
