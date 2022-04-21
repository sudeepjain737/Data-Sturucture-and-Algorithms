package SSSPPUsingBFS.UsingAdjacencyMatrix;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Graph {
    ArrayList<GraphNode>nodeList = new ArrayList<>();
    int adjacencyMatrix[][];

    Graph(ArrayList<GraphNode>nodeList){
        this.nodeList = nodeList;
        adjacencyMatrix = new int[nodeList.size()][nodeList.size()];
    }

    public void addUndirectedEdges(int i ,int j){
        adjacencyMatrix[i][j] = 1;
        adjacencyMatrix[j][i] = 1;
    }

    public void printAdjacencyMatrix(){
        System.out.print("   ");
        for (int i = 0; i < nodeList.size(); i++) {
            System.out.print(nodeList.get(i).value + " ");
        }
        System.out.println();
        for (int i = 0; i < nodeList.size(); i++) {
            System.out.print(nodeList.get(i).value + ": ");
            for (int j = 0; j < adjacencyMatrix.length; j++) {
                System.out.print(adjacencyMatrix[nodeList.get(i).index][j] + " ");
            }
            System.out.println();
        }
    }

    public ArrayList<GraphNode> getNeighbours(GraphNode node){
        ArrayList<GraphNode>neighbours = new ArrayList<>();
        for (int i = 0; i < adjacencyMatrix.length; i++) {
            if(adjacencyMatrix[node.index][i] == 1){
                neighbours.add(nodeList.get(i));
            }
        }
        return neighbours;
    }

    public void printPaths(GraphNode node){
        if(node.parent != null){
            printPaths(node.parent);
        }
        System.out.print(node.value + " ");
    }

    public void BFSForSSSPP(GraphNode node) {
        Queue<GraphNode> queue = new LinkedList<>();
        queue.add(node);
        while (queue.isEmpty() == false) {
            GraphNode current = queue.remove();
            current.isVisited = true;
            System.out.print("Printing Path for " + current.value + " is: ");
            printPaths(current);
            System.out.println();
            ArrayList<GraphNode> neighbours = getNeighbours(current);
            for (int i = 0; i < neighbours.size(); i++) {
                if (neighbours.get(i).isVisited == false) {
                    queue.add(neighbours.get(i));
                    neighbours.get(i).isVisited = true;
                    neighbours.get(i).parent = current;
                }
            }
        }
    }
}
