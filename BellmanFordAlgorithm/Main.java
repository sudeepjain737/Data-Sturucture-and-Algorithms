package BellmanFordAlgorithm;

import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<WeightedNode> nodeList = new ArrayList<>();
        nodeList.add(new WeightedNode("A", 0));
        nodeList.add(new WeightedNode("B", 1));
        nodeList.add(new WeightedNode("C", 2));
        nodeList.add(new WeightedNode("D", 3));
        nodeList.add(new WeightedNode("E", 4));
        nodeList.add(new WeightedNode("F", 5));
        nodeList.add(new WeightedNode("G", 6));

        WeightedGraph g = new WeightedGraph(nodeList);

        g.addWeightedNodes(0, 1, 2);
        g.addWeightedNodes(0, 2, 5);
        g.addWeightedNodes(1, 2, 6);
        g.addWeightedNodes(1, 3, 1);
        g.addWeightedNodes(1, 4, 3);
        g.addWeightedNodes(2, 5, 8);
        g.addWeightedNodes(2, 4, 4);
        g.addWeightedNodes(4, 6, 9);
        g.addWeightedNodes(5, 6, 7);
        System.out.println("Printing Bellman Ford from source: " + nodeList.get(0).name);
        g.bellmanFord(nodeList.get(0));
    }
}
