package BinaryTree.UsingLinkedList;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeMethods {
    public BinaryNode root;
    BinaryTreeMethods(){
        root = null;
    }

    //           Insert Method to insert a node in Binary Tree using LevelOrder Traversal
    public void insert(String data){
        BinaryNode newNode = new BinaryNode();
        newNode.value = data;
        if(root == null){
            root = newNode;
        }
        else{
            Queue<BinaryNode>queue = new LinkedList<>();
            queue.add(root);
            BinaryNode currentNode = new BinaryNode();
            while (queue.isEmpty() == false){
                currentNode = queue.remove();
                if(currentNode.left == null){
                    currentNode.left = newNode;
                    break;
                }
                else if(currentNode.right == null){
                    currentNode.right = newNode;
                    break;
                }
                else {
                    queue.add(currentNode.left);
                    queue.add(currentNode.right);
                }
            }
        }
        System.out.println("Value Inserted Successfully");
    }

    //                   PreOrder Traversal
    public void preOrderTraversal(BinaryNode node){
        if(node == null){
            return;
        }
        else{
            System.out.print(node.value + "-->");
            preOrderTraversal(node.left);
            preOrderTraversal(node.right);
        }
    }

    //                    InOrder Traversal
    public void inOrderTraversal(BinaryNode node){
        if(node == null){
            return;
        }
        else{
            inOrderTraversal(node.left);
            System.out.print(node.value + "-->");
            inOrderTraversal(node.right);
        }
    }

    //                   PostOrder Traversal
    public void postOrderTraversal(BinaryNode node){
        if(node == null){
            return;
        }
        else{
            postOrderTraversal(node.left);
            postOrderTraversal(node.right);
            System.out.print(node.value + "-->");
        }
    }

    //                   LevelOrder Traversal
    public void levelOrderTraversal(){
        Queue<BinaryNode>queue = new LinkedList<>();
        queue.add(root);
        BinaryNode currentNode = new BinaryNode();
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

    //          Search Method in Binary Tree Using LevelOrder Traversal
    public void search(String s){
        Queue<BinaryNode>queue = new LinkedList<>();
        queue.add(root);
        BinaryNode currentNode = new BinaryNode();
        while (queue.isEmpty() == false){
            currentNode = queue.remove();
            if(currentNode.value.equals(s)){
                System.out.println("Value is found in Binary Tree");
                return;
            }
            else{
                if(currentNode.left != null){
                    queue.add(currentNode.left);
                }
                if(currentNode.right != null){
                    queue.add(currentNode.right);
                }
            }
        }
        System.out.println("Value is not available in Binary Tree");
    }

//           Method to find DeepestNode in Binary Tree
    public BinaryNode deepestNode(){
        Queue<BinaryNode>queue = new LinkedList<>();
        queue.add(root);
        BinaryNode currentNode = new BinaryNode();
        while (queue.isEmpty() == false){
            currentNode = queue.remove();
            if(currentNode.left != null){
                queue.add(currentNode.left);
            }
            if(currentNode.right != null){
                queue.add(currentNode.right);
            }
        }
        return currentNode;
    }

//          Method to delete DeepestNode in Binary Tree
    public void deleteDeepestNode(BinaryNode node){
        Queue<BinaryNode>queue = new LinkedList<>();
        queue.add(root);
        BinaryNode currentNode = new BinaryNode();
        while (queue.isEmpty() == false){
            currentNode = queue.remove();
            if(currentNode == node){
                currentNode = null;
                return;
            }
            if(currentNode.left != null){
                if(currentNode.left == node){
                    currentNode.left = null;
                    return;
                }
                else {
                    queue.add(currentNode.left);
                }
            }
            if(currentNode.right != null){
                if(currentNode.right == node){
                    currentNode.right = null;
                    return;
                }
                else {
                    queue.add(currentNode.right);
                }
            }
        }
    }

    //           Delete Method to delete a node in Binary Tree using LevelOrder Traversal
    public void delete(String s){
        Queue<BinaryNode>queue = new LinkedList<>();
        queue.add(root);
        BinaryNode currentNode = new BinaryNode();
        while (queue.isEmpty() == false){
            currentNode = queue.remove();
            if(currentNode.value.equals(s)){
                currentNode.value = deepestNode().value;
                deleteDeepestNode(deepestNode());
                System.out.println("Value Deleted Successfully");
                return;
            }
            else{
                if(currentNode.left != null){
                    queue.add(currentNode.left);
                }
                if(currentNode.right != null){
                    queue.add(currentNode.right);
                }
            }
        }
        System.out.println("Value is not present in the Binary Tree");
    }
}
