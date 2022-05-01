package DijkstraAlgorithm;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<WeightedNode>nodeList = new ArrayList<>();
//        nodeList.add(new WeightedNode("A",0));
//        nodeList.add(new WeightedNode("B",1));
//        nodeList.add(new WeightedNode("C",2));
//        nodeList.add(new WeightedNode("D",3));
//        nodeList.add(new WeightedNode("E",4));
//        nodeList.add(new WeightedNode("F",5));
//        nodeList.add(new WeightedNode("G",6));
//
//        WeightedGraph g = new WeightedGraph(nodeList);
//
//        g.addWeightedEdges(0,1,2);
//        g.addWeightedEdges(0,2,5);
//        g.addWeightedEdges(1,2,6);
//        g.addWeightedEdges(1,3,1);
//        g.addWeightedEdges(1,4,3);
//        g.addWeightedEdges(2,5,8);
//        g.addWeightedEdges(2,4,4);
//        g.addWeightedEdges(4,6,9);
//        g.addWeightedEdges(5,6,7);
//        System.out.println("Printing Dijkstra from source: " + nodeList.get(0).name);
//        g.dijkstra(nodeList.get(0));

        nodeList.add(new WeightedNode("A",0));
        nodeList.add(new WeightedNode("B",1));
        nodeList.add(new WeightedNode("C",2));
        nodeList.add(new WeightedNode("D",3));
        nodeList.add(new WeightedNode("E",4));

        WeightedGraph g = new WeightedGraph(nodeList);

        g.addWeightedEdges(0,2,6);
        g.addWeightedEdges(0,3,6);
        g.addWeightedEdges(1,0,3);
        g.addWeightedEdges(2,3,1);
        g.addWeightedEdges(3,1,1);
        g.addWeightedEdges(4,1,4);
        g.addWeightedEdges(4,3,2);
        System.out.println("Printing Dijkstra from source: " + nodeList.get(0).name);
        g.dijkstra(nodeList.get(0));
    }
}
