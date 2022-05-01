package AVLTree;

public class Main {
    public static void main(String[] args) {
        AVLMethods m = new AVLMethods();
        m.insert(5);
        m.insert(10);
        m.insert(15);
        m.insert(20);

        m.levelOrderTraversal();
        System.out.println();

        m.delete(5);
        m.levelOrderTraversal();
        System.out.println();
    }
}
