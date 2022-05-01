package DijkstraAlgorithm;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class WeightedGraph {
    ArrayList<WeightedNode>nodeList = new ArrayList<>();

    WeightedGraph(ArrayList<WeightedNode>nodeList){
        this.nodeList = nodeList;
    }

    public void addWeightedEdges(int i,int j,int d){
        WeightedNode first = nodeList.get(i);
        WeightedNode second = nodeList.get(j);
        first.neighbours.add(second);
        first.weightMap.put(second,d);
    }

    public void dijkstra(WeightedNode node){
        PriorityQueue<WeightedNode>queue = new PriorityQueue<>();
        node.distance = 0;
        queue.addAll(nodeList);
        while (queue.isEmpty() == false){
            WeightedNode current = queue.remove();
            for (int i = 0; i < current.neighbours.size(); i++) {
                if(queue.contains(current.neighbours.get(i)) == true){
                    if(current.neighbours.get(i).distance > current.distance + current.weightMap.get(current.neighbours.get(i))){
                        current.neighbours.get(i).distance = current.distance + current.weightMap.get(current.neighbours.get(i));
                        current.neighbours.get(i).parent = current;
                        queue.remove(current.neighbours.get(i));
                        queue.add(current.neighbours.get(i));
                    }
                }
            }
        }
        for (WeightedNode nodeToCheck : nodeList) {
            System.out.print("Node " + nodeToCheck + ", distance: " + nodeToCheck.distance + ", Path: ");
            pathPrint(nodeToCheck);
            System.out.println();
        }
    }
    public static void pathPrint(WeightedNode node) {
        if (node.parent  != null) {
            pathPrint(node.parent);
        }
        System.out.print(node.name + " ");
    }
}
