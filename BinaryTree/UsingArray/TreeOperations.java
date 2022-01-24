package BinaryTree.UsingArray;

public class TreeOperations {
    public static void main(String[] args) {
        TreeMethods t1 = new TreeMethods(9);
        t1.insert(1);
        t1.insert(2);
        t1.insert(3);
        t1.insert(4);
        t1.insert(5);
        t1.insert(6);
        t1.insert(7);
        t1.insert(8);
        t1.insert(9);
        t1.preOrder(1);
        System.out.println();
        t1.inOrder(1);
        System.out.println();
        t1.postOrder(1);
        System.out.println();
        t1.levelOrder();
        System.out.println();
        t1.search(4);
        t1.delete(5);
        t1.levelOrder();
    }
}
