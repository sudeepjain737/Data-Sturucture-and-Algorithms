package BinaryTree.UsingArray;

public class TreeMethods {
    int BinaryTree[];
    int lastUsedIndex;

//           Creation of a Binary Tree using Array

    TreeMethods(int size){
        BinaryTree = new int[size+1];
        lastUsedIndex = 0;
        System.out.println("Binary Tree of Size " + size + " is created");
    }

//             Method to Check Binary Tree is Full or not

    public boolean isFull(){
        if(lastUsedIndex == BinaryTree.length-1){
            return true;
        }
        else {
            return false;
        }
    }

//             Method to insert a node in Binary Tree

    public void insert(int n){
        if(isFull()){
            System.out.println("Can't insert because Tree is Full");
            return;
        }
        else{
            BinaryTree[lastUsedIndex+1] = n;
            lastUsedIndex = lastUsedIndex+1;
            System.out.println("Insert Successfully");
        }
    }

//           PreOrder Traversal using Array

    public void preOrder(int index) {
        if (index > lastUsedIndex) {
            return;
        } else {
            System.out.print(BinaryTree[index] + " ");
            preOrder(2 * index);
            preOrder((2 * index) + 1);
        }
    }

//          InOrder Traversal using Array

        public void inOrder(int index){
            if(index > lastUsedIndex){
                return;
            }
            else{
                inOrder(2*index);
                System.out.print(BinaryTree[index] + " ");
                inOrder((2*index)+1);
            }
    }

//         PostOrder Traversal using Array

    public void postOrder(int index){
        if(index > lastUsedIndex){
            return;
        }
        else{
            postOrder(2*index);
            postOrder((2*index)+1);
            System.out.print(BinaryTree[index] + " ");
        }
    }

//             LevelOrder Traversal using Array

    public void levelOrder(){
        for (int i = 1; i <=lastUsedIndex ; i++) {
            System.out.print(BinaryTree[i] + " ");
        }
    }

//            Method for Searching a node in Binary Tree using LevelOrder Traversal

    public void search(int n){
        for (int i = 1 ; i <= lastUsedIndex; i++) {
            if (BinaryTree[i] == n) {
                System.out.println("Element found on index:" + i);
                return;
            }
        }
        System.out.println("Element not present in the Tree");
    }

//            Method for Deleting a node in Binary Tree using LevelOrder Traversal

    public void delete(int n){
        int c = -1;
        for (int i = 1; i <= lastUsedIndex; i++) {
            if(BinaryTree[i] == n){
                c = i;
                break;
            }
        }
        if(c == -1){
            System.out.println("Can't delete Element because element not present in the Tree");
        }
        else{
            BinaryTree[c] = BinaryTree[lastUsedIndex];
            lastUsedIndex = lastUsedIndex-1;
            System.out.println("Deleted Successfully");
        }
    }

//            Method to Delete Binary Tree

    public void deleteBT(){
        BinaryTree = null;
        System.out.println("Binary Tree Deleted Successfully");
    }
}
