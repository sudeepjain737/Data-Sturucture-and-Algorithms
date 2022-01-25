package BinaryTree.UsingLinkedList;

public class MainClass {
    public static void main(String[] args) {
        BinaryTreeMethods b = new BinaryTreeMethods();

        b.insert("N1");
        b.insert("N2");
        b.insert("N3");
        b.insert("N4");
        b.insert("N5");
        b.insert("N6");
        b.insert("N7");
        b.insert("N8");
        b.insert("N9");

        b.preOrderTraversal(b.root);
        System.out.println();

        b.inOrderTraversal(b.root);
        System.out.println();

        b.postOrderTraversal(b.root);
        System.out.println();

        b.levelOrderTraversal();
        System.out.println();

        b.search("N5");
        b.search("N10");

        System.out.println(b.deepestNode().value);

        b.delete("N3");
        b.levelOrderTraversal();

    }
}
