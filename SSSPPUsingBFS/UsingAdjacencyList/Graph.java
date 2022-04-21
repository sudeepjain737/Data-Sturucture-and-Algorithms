package SSSPPUsingBFS.UsingAdjacencyList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Graph {
    ArrayList<GraphNode>nodeList = new ArrayList<>();

    Graph(ArrayList<GraphNode>nodeList){
        this.nodeList = nodeList;
    }

    public void addUndirectedEdge(int i,int j){
        GraphNode first = nodeList.get(i);
        GraphNode second = nodeList.get(j);
        first.neighbours.add(second);
        second.neighbours.add(first);
    }

    public void printAdjacencyList(){
        for (int i = 0; i < nodeList.size(); i++) {
            System.out.print(nodeList.get(i).value + ": ");
            for (int j = 0; j < nodeList.get(i).neighbours.size(); j++) {
                System.out.print(nodeList.get(i).neighbours.get(j).value);
                if(j != nodeList.get(i).neighbours.size()-1){
                    System.out.print(" --> ");
                }
            }
            System.out.println();
        }
    }

    public void printPaths(GraphNode node){
        if(node.parent != null){
            printPaths(node.parent);
        }
        System.out.print(node.value + " ");
    }

    public void BFSForSSSPP(GraphNode node){
        Queue<GraphNode>queue = new LinkedList<>();
        queue.add(node);
        while (queue.isEmpty() == false){
            GraphNode current = queue.remove();
            current.isVisited = true;
            System.out.print("Printing Paths for " + current.value + " is: ");
            printPaths(current);
            System.out.println();
            for (int i = 0; i < current.neighbours.size(); i++) {
                if(current.neighbours.get(i).isVisited == false){
                    queue.add(current.neighbours.get(i));
                    current.neighbours.get(i).isVisited = true;
                    current.neighbours.get(i).parent = current;
                }
            }
        }
    }
}
