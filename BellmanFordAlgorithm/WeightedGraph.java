package BellmanFordAlgorithm;

import java.util.ArrayList;

public class WeightedGraph {
    ArrayList<WeightedNode>nodeList = new ArrayList<>();

    WeightedGraph(ArrayList<WeightedNode>nodeList){
        this.nodeList = nodeList;
    }

    public void addWeightedNodes(int i,int j,int d){
        WeightedNode first = nodeList.get(i);
        WeightedNode second = nodeList.get(j);
        first.neighbours.add(second);
        first.weightMap.put(second,d);
    }

    public void bellmanFord(WeightedNode sourceNode){
        sourceNode.distance = 0;
        for (int i = 0; i < nodeList.size(); i++) {
            for(WeightedNode currentNode : nodeList){
                for (WeightedNode neighbours : currentNode.neighbours){
                    if(neighbours.distance > currentNode.distance + currentNode.weightMap.get(neighbours)){
                        neighbours.distance = currentNode.distance + currentNode.weightMap.get(neighbours);
                        neighbours.parent = currentNode;
                    }
                }
            }
        }
        System.out.println("Checking for Negative Cycle...");
        for(WeightedNode current : nodeList){
            for(WeightedNode neighbours : current.neighbours){
                if(neighbours.distance > current.distance + current.weightMap.get(neighbours)){
                    System.out.println("Negative Cycle Found");
                    System.out.println("Vertex Name: " + neighbours.name);
                    System.out.println("Old Cost: " + neighbours.distance);
                    int newCost = current.distance + current.weightMap.get(neighbours);
                    System.out.println("New Cost: " + newCost);
                    return;
                }
            }
        }
        System.out.println("No Negative Cycle Found");

        for (WeightedNode nodeToCheck : nodeList) {
            System.out.print("Node " + nodeToCheck + ", distance: " + nodeToCheck.distance + ", Path: ");
            printPaths(nodeToCheck);
            System.out.println();
        }
    }

    public void printPaths(WeightedNode node){
        if(node.parent != null){
            printPaths(node.parent);
        }
        System.out.print(node.name + " ");
    }
}
