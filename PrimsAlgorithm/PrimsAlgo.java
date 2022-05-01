package PrimsAlgorithm;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class PrimsAlgo {
    public ArrayList<WeightedNode>nodeList = new ArrayList<>();

    PrimsAlgo(ArrayList<WeightedNode>nodeList){
        this.nodeList = nodeList;
    }

    public void addWeightedEdge(int i,int j,int d){
        WeightedNode first = nodeList.get(i);
        WeightedNode second = nodeList.get(j);
        first.neighbours.add(second);
        second.neighbours.add(first);
        first.weightMap.put(second,d);
        second.weightMap.put(first,d);
    }

    public void prims(WeightedNode sourceNode){
        PriorityQueue<WeightedNode>queue = new PriorityQueue<>();
        queue.addAll(nodeList);
        sourceNode.distance = 0;
        while (queue.isEmpty() == false){
            WeightedNode currentNode = queue.remove();
            for (int i = 0; i < currentNode.neighbours.size(); i++) {
                if(queue.contains(currentNode.neighbours.get(i)) == true){
                    if(currentNode.neighbours.get(i).distance > currentNode.weightMap.get(currentNode.neighbours.get(i))){
                        currentNode.neighbours.get(i).distance = currentNode.weightMap.get(currentNode.neighbours.get(i));
                        currentNode.neighbours.get(i).parent = currentNode;
                        queue.remove(currentNode.neighbours.get(i));
                        queue.add(currentNode.neighbours.get(i));
                    }
                }
            }
        }

        int cost = 0;
        for (WeightedNode nodeToCheck : nodeList) {
            System.out.println("Node " + nodeToCheck + ", key: " + nodeToCheck.distance + ", Parent: " + nodeToCheck.parent);
            cost = cost + nodeToCheck.distance;
        }

        System.out.println("\nTotal cost of MST: " + cost);

        for (WeightedNode nodeToCheck : nodeList) {
            System.out.print("Node " + nodeToCheck + ", distance: " + nodeToCheck.distance + ", Path: ");
            printPath(nodeToCheck);
            System.out.println();
        }
    }

    public void printPath(WeightedNode node){
        if(node.parent != null){
            printPath(node.parent);
        }
        System.out.print(node.name + " ");
    }
}
