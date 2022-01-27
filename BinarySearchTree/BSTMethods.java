package BinarySearchTree;

import java.util.LinkedList;
import java.util.Queue;

public class BSTMethods {
    public Node root;
    BSTMethods(){
        root = null;
    }

//           Insert Method to insert a node in Binary Search Tree using LevelOrder Traversal
    public void insert(int n){
        Node newNode = new Node();
        newNode.value = n;
        if(root == null){
            root = newNode;
            System.out.println("Value Insert Successfully");
        }
        else{
            Queue<Node>queue = new LinkedList<>();
            queue.add(root);
            Node currentNode = new Node();
            while (queue.isEmpty() == false){
                currentNode = queue.remove();
                if(currentNode.value >= n){
                    queue.add(currentNode.left);
                    if(currentNode.left == null){
                        currentNode.left = newNode;
                        System.out.println("Value Insert Successfully");
                        return;
                    }
                }
                else {
                    queue.add(currentNode.right);
                        if(currentNode.right == null){
                            currentNode.right = newNode;
                            System.out.println("Value Insert Successfully");
                            return;
                    }
                }
            }
        }
    }

                        // INSERT METHOD USING RECURSION

//    private Node insert(Node node ,int n){
//        if(node == null){
//            Node newNode = new Node();
//            newNode.value = n;
//            System.out.println("Value Insert Successfully");
//            return newNode;
//        }
//        else if(node.value >= n){
//                node.left = insert(node.left,n);
//                return node;
//            }
//        else {
//            node.right = insert(node.right, n);
//            return node;
//        }
//        }
//    public void insert(int n){
//        insert(root,n);
//    }

//                PRE-ORDER TRAVERSAL
    public void preOrderTraversal(Node node){
        if(node == null){
            return;
        }
        System.out.print(node.value + "-->");
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }

//                IN-ORDER TRAVERSAL
    public void inOrderTraversal(Node node){
        if(node == null){
            return;
        }
        inOrderTraversal(node.left);
        System.out.print(node.value + "-->");
        inOrderTraversal(node.right);
    }

//               POST-ORDER TRAVERSAL
    public void postOrderTraversal(Node node){
        if(node == null){
            return;
        }
        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.print(node.value + "-->");
    }

//              LEVEL-ORDER TRAVERSAL
    public void levelOrderTraversal(){
        Queue<Node>queue = new LinkedList<>();
        queue.add(root);
        Node currentNode = new Node();
        while (queue.isEmpty() == false){
            currentNode = queue.remove();
            System.out.print(currentNode.value + "-->");
            if(currentNode.left != null){
                queue.add(currentNode.left);
            }
            if(currentNode.right != null){
                queue.add(currentNode.right);
            }
        }
    }

    //          Search Method in Binary Search Tree Using LevelOrder Traversal
    public void search(int n){
        Queue<Node>queue = new LinkedList<>();
        queue.add(root);
        Node currentNode = new Node();
        while (queue.isEmpty() == false){
            currentNode = queue.remove();
            if(currentNode.value == n){
                System.out.println("Value founded");
                return;
            }
            else if(currentNode.value > n){
                if(currentNode.left != null){
                    queue.add(currentNode.left);
                }
            }
            else{
                if(currentNode.right != null){
                    queue.add(currentNode.right);
                }
            }
        }
        System.out.println("Can't found Value");
    }

//               Method to find MinimumNode in Binary Search Tree
    public Node minimumNode(Node node){
        if(node == null){
            return null;
        }
        else{
            Queue<Node>queue = new LinkedList<>();
            queue.add(node);
            Node currentNode = new Node();
            while (queue.isEmpty() == false){
                currentNode = queue.remove();
                if(currentNode.left != null){
                    queue.add(currentNode.left);
                }
            }
            return currentNode;
        }

        //           RECURSIVE WAY TO FIND MINIMUM-NODE
//        if(node.left == null){
//            return node;
//        }
//        else {
//            return minimumNode(node.left);
//        }
    }

    //           Delete Method to delete a node in Binary Search Tree
    public Node delete(Node currentNode,int n){
        if(currentNode == null){
            System.out.println("Value not available");
            return null;
        }
        else{
            if(currentNode.value > n){
                currentNode.left = delete(currentNode.left,n);
            }
            else if(currentNode.value < n){
                currentNode.right = delete(currentNode.right,n);
            }
            else{
                if(currentNode.right == null && currentNode.left == null){
                    currentNode = null;
                }
                else if(currentNode.left != null && currentNode.right == null){
                    currentNode = currentNode.left;
                }
                else if(currentNode.left == null && currentNode.right != null){
                    currentNode = currentNode.right;
                }
                else {
                    Node minNodeForRight = minimumNode(currentNode.right);
                    currentNode.value = minNodeForRight.value;
                    currentNode.right = delete(currentNode.right,minNodeForRight.value);
                }
            }
            return currentNode;
        }
    }

//             Method to Delete The Whole BST
    public void deleteBST(){
        root = null;
        System.out.println("BST deleted Successfully");
    }
}
