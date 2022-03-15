package BinaryHeap;

public class Main {
    public static void main(String[] args) {
        BinaryHeapMethods b = new BinaryHeapMethods(5);
        b.preOrderTraversal(1);
        b.inOrderTraversal(1);
        b.postOrderTraversal(1);
        b.levelOrderTraversal();
        System.out.println(b.peek());

        b.insert(1,"Max");
        b.insert(2,"Max");
        b.insert(3,"Max");
        b.insert(4,"Max");
        b.insert(5,"Max");
        b.insert(6,"Max");
        b.insert(7,"Max");

        System.out.println(b.peek());

        b.preOrderTraversal(1);
        System.out.println();

        b.inOrderTraversal(1);
        System.out.println();

        b.postOrderTraversal(1);
        System.out.println();

        b.levelOrderTraversal();
        System.out.println();

        System.out.println(b.isEmpty());
        System.out.println(b.isFull());

        System.out.println(b.extract("Max"));

        b.levelOrderTraversal();
        System.out.println();

        System.out.println(b.extract("Max"));

        b.levelOrderTraversal();
        System.out.println();

        b.delete();
        b.levelOrderTraversal();

    }
}
