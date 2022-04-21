package SSSPPUsingBFS.UsingAdjacencyMatrix;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<GraphNode>nodeList = new ArrayList<>();
        nodeList.add(new GraphNode("A",0));
        nodeList.add(new GraphNode("B",1));
        nodeList.add(new GraphNode("C",2));
        nodeList.add(new GraphNode("D",3));
        nodeList.add(new GraphNode("E",4));
        nodeList.add(new GraphNode("F",5));
        nodeList.add(new GraphNode("G",6));

        Graph g = new Graph(nodeList);

        g.addUndirectedEdges(0,1);
        g.addUndirectedEdges(0,2);
        g.addUndirectedEdges(1,3);
        g.addUndirectedEdges(1,6);
        g.addUndirectedEdges(2,3);
        g.addUndirectedEdges(2,4);
        g.addUndirectedEdges(3,5);
        g.addUndirectedEdges(4,5);
        g.addUndirectedEdges(5,6);

//        g.printAdjacencyMatrix();

        g.BFSForSSSPP(g.nodeList.get(0));

    }
}
