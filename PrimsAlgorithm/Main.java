package PrimsAlgorithm;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<WeightedNode> nodes = new ArrayList<>();
        nodes.add(new WeightedNode("A",0));
        nodes.add(new WeightedNode("B",1));
        nodes.add(new WeightedNode("C",2));
        nodes.add(new WeightedNode("D",3));
        nodes.add(new WeightedNode("E",4));
        PrimsAlgo m = new PrimsAlgo(nodes);

        m.addWeightedEdge(0,1,4);
        m.addWeightedEdge(0,2,8);
        m.addWeightedEdge(1,2,2);
        m.addWeightedEdge(1,3,6);
        m.addWeightedEdge(2,3,3);
        m.addWeightedEdge(2,4,9);
        m.addWeightedEdge(3,4,5);

        m.prims(nodes.get(0));
    }
}
