package Graphs.GraphsUsingAdjacencyMatrix;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Graph {
    ArrayList<GraphNode>nodeList = new ArrayList<>();
    int [][] adjacencyMatrix;

    Graph(ArrayList<GraphNode>nodeList){
        this.nodeList = nodeList;
        adjacencyMatrix = new int[nodeList.size()][nodeList.size()];
    }

    public void addUndirectedEdge(int i ,int j){
        adjacencyMatrix[i][j] = 1;
        adjacencyMatrix[j][i] = 1;
    }

    //     Traversal of the AdjacencyMatrix
    public void traverseMatrix(){
        System.out.print("   ");
        for (int i = 0; i < nodeList.size(); i++) {
            System.out.print(nodeList.get(i).value + " ");
        }
        System.out.println();
        for (int i = 0; i < nodeList.size(); i++) {
            System.out.print(nodeList.get(i).value + ": ");
            for (int j = 0; j < adjacencyMatrix[i].length; j++) {
                System.out.print(adjacencyMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    //     Method to Get all Neighbours of a Node
    public ArrayList<GraphNode> getNeighbours(GraphNode node){
        ArrayList<GraphNode>neighbour = new ArrayList<>();
        for (int i = 0; i < adjacencyMatrix.length; i++) {
            if(adjacencyMatrix[node.index][i] == 1){
                neighbour.add(nodeList.get(i));
            }
        }
        return neighbour;
    }

    //      Internally Breadth First Search
    public void bfsVisit(GraphNode node){
        Queue<GraphNode> queue = new LinkedList<>();
        queue.add(node);
        while (queue.isEmpty() == false){
            GraphNode currentNode = queue.remove();
            currentNode.isVisited = true;
            System.out.print(currentNode.value + " ");
            ArrayList<GraphNode>neighbours = getNeighbours(currentNode);
            for (int i = 0; i < neighbours.size(); i++) {
                if(neighbours.get(i).isVisited == false){
                    queue.add(neighbours.get(i));
                    neighbours.get(i).isVisited = true;
                }
            }
        }
    }

    //       Breadth First Search Method
    public void breadthFirstSearch(){
        for (int i = 0; i < nodeList.size(); i++) {
            if (nodeList.get(i).isVisited == false) {
                bfsVisit(nodeList.get(i));
            }
        }
    }

    //      Internally Depth First Search
    public void dfsVisit(GraphNode node){
        Stack<GraphNode>stack = new Stack<>();
        stack.push(node);
        while (stack.isEmpty() == false){
            GraphNode currentNode = stack.pop();
            currentNode.isVisited = true;
            System.out.print(currentNode.value + " ");
            ArrayList<GraphNode>neighbours = getNeighbours(currentNode);
            for (int i = 0; i < neighbours.size(); i++) {
                if(neighbours.get(i).isVisited == false){
                    stack.push(neighbours.get(i));
                    neighbours.get(i).isVisited = true;
                }
            }
        }
    }

    //       Depth First Search
    public void depthFirstSearch(){
        for (int i = 0; i < nodeList.size(); i++) {
            if(nodeList.get(i).isVisited == false){
                dfsVisit(nodeList.get(i));
            }
        }
    }
}
