package BinaryHeap;

public class BinaryHeapMethods {
    public int BinaryHeap[];
    public int sizeOfHeap;

    BinaryHeapMethods(int n){
        BinaryHeap = new int[n+1];
        sizeOfHeap = 0;
        System.out.println("Binary Heap is Created");
    }

    //   Is Empty Method To Check Binary Heap is Empty or Not
    public boolean isEmpty(){
        if(sizeOfHeap == 0){
            return true;
        }
        else {
            return false;
        }
    }

    //   Is Full Method To Check Binary Heap is Full or Not
    public boolean isFull(){
        if(sizeOfHeap == BinaryHeap.length-1){
            return true;
        }
        else {
            return false;
        }
    }

    public Integer peek(){
        if(isEmpty()){
            System.out.println("Binary Heap is EMPTY!!!");
            return null;
        }
        else {
            return BinaryHeap[1];
        }
    }

    //   PreOrder Traversal for Binary Heap
    public void preOrderTraversal(int index){
        if(isEmpty()){
            System.out.println("Binary Heap is Empty");
            return;
        }
        if(index > sizeOfHeap){
            return;
        }
        System.out.print(BinaryHeap[index] + " ");
        preOrderTraversal(index * 2);
        preOrderTraversal((index * 2) + 1 );
    }

    //   InOrder Traversal for Binary Heap
    public void inOrderTraversal(int index){
        if(isEmpty()){
            System.out.println("Binary Heap is Empty");
            return;
        }
        if(index > sizeOfHeap){
            return;
        }
        inOrderTraversal(index * 2);
        System.out.print(BinaryHeap[index] + " ");
        inOrderTraversal((index * 2) + 1 );
    }

    //   PostOrder Traversal for Binary Heap
    public void postOrderTraversal(int index){
        if(isEmpty()){
            System.out.println("Binary Heap is Empty");
            return;
        }
        if(index > sizeOfHeap){
            return;
        }
        postOrderTraversal(index * 2);
        postOrderTraversal((index * 2) + 1 );
        System.out.print(BinaryHeap[index] + " ");
    }

    //   LevelOrder Traversal for Binary Heap
    public void levelOrderTraversal(){
        if(isEmpty()){
            System.out.println("Binary Heap is Empty");
            return;
        }
        for (int i = 1; i <= sizeOfHeap; i++) {
            System.out.print(BinaryHeap[i] + " ");
        }
    }

    //   Heapify Method to maintain Property of Binary Heap From Bottom to Top
    public void heapifyBottomToTop(int index,String HeapType){
        int parent = index / 2;
        if(index <= 1){
            return;
        }
        if(HeapType.equals("Min")) {
            if (BinaryHeap[index] < BinaryHeap[parent]) {
                int temp = BinaryHeap[parent];
                BinaryHeap[parent] = BinaryHeap[index];
                BinaryHeap[index] = temp;
            }
        }
        else if(HeapType.equals("Max")){
            if (BinaryHeap[index] > BinaryHeap[parent]) {
                int temp = BinaryHeap[parent];
                BinaryHeap[parent] = BinaryHeap[index];
                BinaryHeap[index] = temp;
            }
        }
        heapifyBottomToTop(parent,HeapType);
    }

    //   Method to Insert a Node in Binary Heap
    public void insert(int value,String HeapType){
        if(isFull()){
            System.out.println("Can't Insert, Binary Heap is FULL!!!");
            return;
        }
        else {
            sizeOfHeap++;
            BinaryHeap[sizeOfHeap] = value;
            heapifyBottomToTop(sizeOfHeap,HeapType);
            System.out.println("Value Inserted Successfully");
        }
    }

    //   Heapify Method to maintain Property of Binary Heap From Top to Bottom
    public void heapifyTopToBottom(int index,String HeapType) {
        int left = index * 2;
        int right = (index * 2) + 1;
        int swapIndex = 1;
        if (sizeOfHeap < left) {
            return;
        }
        if (HeapType.equals("Max")) {
            if (sizeOfHeap == left) {
                if (BinaryHeap[index] < BinaryHeap[left]) {
                    int temp = BinaryHeap[left];
                    BinaryHeap[left] = BinaryHeap[index];
                    BinaryHeap[index] = temp;
                }
                return;
            } else {
                if (BinaryHeap[left] > BinaryHeap[right]) {
                    swapIndex = left;
                } else {
                    swapIndex = right;
                }
                if (BinaryHeap[index] < BinaryHeap[swapIndex]) {
                    int temp = BinaryHeap[swapIndex];
                    BinaryHeap[swapIndex] = BinaryHeap[index];
                    BinaryHeap[swapIndex] = temp;
                }
            }
        } else if (HeapType.equals("Min")) {
            if (sizeOfHeap == left) {
                if (BinaryHeap[index] > BinaryHeap[left]) {
                    int temp = BinaryHeap[left];
                    BinaryHeap[left] = BinaryHeap[index];
                    BinaryHeap[index] = temp;
                }
                return;
            } else {
                if (BinaryHeap[left] < BinaryHeap[right]) {
                    swapIndex = left;
                } else {
                    swapIndex = right;
                }
                if (BinaryHeap[index] > BinaryHeap[swapIndex]) {
                    int temp = BinaryHeap[swapIndex];
                    BinaryHeap[swapIndex] = BinaryHeap[index];
                    BinaryHeap[swapIndex] = temp;
                }
            }
        }
        heapifyBottomToTop(swapIndex, HeapType);
    }


    //  Method to Extract top Node In Binary Heap
    public int extract(String HeapType){
        if(isEmpty()){
            System.out.println("Binary Heap is Empty!!!");
            return -1;
        }
        else {
            int val = BinaryHeap[1];
            BinaryHeap[1] = BinaryHeap[sizeOfHeap];
            sizeOfHeap--;
            heapifyTopToBottom(1,HeapType);
            return val;
        }
    }

    // Method to Delete Whole Binary Heap
    public void delete(){
        BinaryHeap = null;
        System.out.println("Binary Heap Deleted Successfully");
    }


}
