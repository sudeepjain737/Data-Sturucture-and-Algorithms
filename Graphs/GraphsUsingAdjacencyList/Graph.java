package Graphs.GraphsUsingAdjacencyList;

import org.w3c.dom.NodeList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Graph {
    ArrayList<GraphNode>nodeList = new ArrayList<>();

    Graph(ArrayList<GraphNode> nodeList){
        this.nodeList = nodeList;
    }

    public void addUndirectedEdge(int i,int j){
        GraphNode first = nodeList.get(i);
        GraphNode second = nodeList.get(j);
        first.neighbours.add(second);
        second.neighbours.add(first);
    }

    //     Traversal of the AdjacencyList
    public void traverseAdjacencyList(){
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

    //      Internally Breadth First Search
    public void bfsVisit(GraphNode node){
        Queue<GraphNode>queue = new LinkedList<>();
        queue.add(node);
        while (queue.isEmpty() == false){
            GraphNode currentNode = queue.remove();
            currentNode.isVisited = true;
            System.out.print(currentNode.value + " ");
            for (int i = 0; i < currentNode.neighbours.size(); i++) {
                if(currentNode.neighbours.get(i).isVisited == false){
                    queue.add(currentNode.neighbours.get(i));
                    currentNode.neighbours.get(i).isVisited = true;
                }
            }
        }
    }

    //       Breadth First Search Method
    public void breadthFirstSearch(){
        for (int i = 0; i < nodeList.size(); i++) {
            if(nodeList.get(i).isVisited == false){
                bfsVisit(nodeList.get(i));
            }
        }
    }

    //      Internally Depth First Search
    public void dfsVisit(GraphNode node){
        Stack<GraphNode>stack = new Stack<>();
        stack.push(node);
        while (stack.isEmpty() == false){
            GraphNode currentNode =  stack.pop();
            currentNode.isVisited = true;
            System.out.print(currentNode.value + " ");
            for (int i = 0; i < currentNode.neighbours.size(); i++) {
                if(currentNode.neighbours.get(i).isVisited == false){
                    stack.push(currentNode.neighbours.get(i));
                    currentNode.neighbours.get(i).isVisited = true;
                }
            }
        }
    }

    //       Depth First Search Method
    public void depthFirstSearch(){
        for (int i = 0; i < nodeList.size(); i++) {
            if(nodeList.get(i).isVisited == false){
                dfsVisit(nodeList.get(i));
            }
        }
    }
}
