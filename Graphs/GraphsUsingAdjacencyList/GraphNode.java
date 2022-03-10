package Graphs.GraphsUsingAdjacencyList;

import java.util.ArrayList;

public class GraphNode {
    public String value;
    public int index;
    public boolean isVisited = false;

    ArrayList<GraphNode>neighbours = new ArrayList<>();

    GraphNode(String value,int index){
        this.index = index;
        this.value = value;
    }
}
