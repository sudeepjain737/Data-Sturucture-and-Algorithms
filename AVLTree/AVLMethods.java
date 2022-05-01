package AVLTree;

import java.util.LinkedList;
import java.util.Queue;

public class AVLMethods {
    public Node root;

    AVLMethods(){
        this.root = null;
        System.out.println("AVL Tree Created");
    }

    public void preOrderTraversal(Node node){
        if(node == null){
            return;
        }
        System.out.print(node.value + " ");
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }

    public void inOrderTraversal(Node node){
        if(node == null){
            return;
        }
        inOrderTraversal(node.left);
        System.out.print(node.value + " ");
        inOrderTraversal(node.right);
    }

    public void postOrderTraversal(Node node){
        if(node == null){
            return;
        }
        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.print(node.value + " ");
    }

    public void levelOrderTraversal() {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (queue.isEmpty() == false) {
            Node currentNode = queue.remove();
            System.out.print(currentNode.value + " ");
            if (currentNode.left != null) {
                queue.add(currentNode.left);
            }
            if (currentNode.right != null) {
                queue.add(currentNode.right);
            }
        }
    }

    public void search(Node node, int value){
        if(node == null){
            System.out.println("Value Not found");
            return;
        }
        else if(node.value == value){
            System.out.println("Value Founded");
            return;
        }
        else if(node.value > value){
            search(node.left,value);
        }
        else {
            search(node.right,value);
        }
    }

    public int getHeight(Node node){
        if(node == null){
            return 0;
        }
        else {
            return node.height;
        }
    }

    private Node rotateRight(Node disbalanceNode){
        Node temp = disbalanceNode.left;
        disbalanceNode.left = disbalanceNode.left.right;
        temp.right = disbalanceNode;
        disbalanceNode.height = 1 + Math.max(getHeight(disbalanceNode.left) , getHeight(disbalanceNode.right));
        temp.height = 1 + Math.max(getHeight(temp.left) , getHeight(temp.right));
        return temp;
    }

    private Node rotateLeft(Node disbalanceNode){
        Node temp = disbalanceNode.right;
        disbalanceNode.right = disbalanceNode.right.left;
        temp.left = disbalanceNode;
        disbalanceNode.height = 1 + Math.max(getHeight(disbalanceNode.left) , getHeight(disbalanceNode.right));
        temp.height = 1 + Math.max(getHeight(temp.left) , getHeight(temp.right));
        return temp;
    }

    public int getBalance(Node node){
        if(node == null){
            return 0;
        }
        else {
            return getHeight(node.left) - getHeight(node.right);
        }
    }

    private Node insertNode(Node node,int value){
        if(node == null){
            Node newNode = new Node();
            newNode.value = value;
            newNode.height = 1;
            return newNode;
        }
        else if(node.value > value){
            node.left = insertNode(node.left,value);
        }
        else {
            node.right = insertNode(node.right,value);
        }
        node.height = 1 + Math.max(getHeight(node.left) , getHeight(node.right));
        int balance = getBalance(node);

        if(balance > 1 && value < node.left.value){
            return rotateRight(node);
        }
        if(balance > 1 && value > node.left.value){
            node.left = rotateLeft(node.left);
            return rotateRight(node);
        }
        if(balance < -1 && value > node.right.value){
            return rotateLeft(node);
        }
        if(balance < -1 && value < node.right.value){
            node.right = rotateRight(node.right);
            return rotateLeft(node);
        }
        return node;
    }

    public void insert(int value){
        root = insertNode(root,value);
    }

    public static Node minimumNode(Node node){
        if(node.left == null){
            return node;
        }
        return minimumNode(node.left);
    }

    private Node deleteNode(Node node,int value){
        if(node == null){
            System.out.print("Value Not Found");
            return node;
        }
        if(node.value > value){
            node.left = deleteNode(node.left,value);
        }
        else if(node.value < value){
            node.right = deleteNode(node.right,value);
        }
        else {
            if(node.left == null && node.right == null){
                node = null;
            }
            else if(node.left != null && node.right == null){
                node = node.left;
            }
            else if(node.left == null && node.right != null){
                node = node.right;
            }
            else {
                Node minNodeForRight = minimumNode(node.right);
                node.value = minNodeForRight.value;
                node.right = deleteNode(node.right,minNodeForRight.value);
            }
        }

        int balance = getBalance(node);

        if(balance > 1 && getBalance(node.left) >= 0){
            return rotateRight(node);
        }
        if(balance > 1 && getBalance(node.left) < 0){
            node.left = rotateLeft(node.left);
            return rotateRight(node);
        }
        if(balance < -1 && getBalance(node.right) <= 0){
            return rotateLeft(node);
        }
        if(balance < -1 && getBalance(node.right) > 0){
            node.right = rotateRight(node.right);
            return rotateLeft(node);
        }
        return node;
    }

    public void delete(int value){
        root = deleteNode(root,value);
    }
}
