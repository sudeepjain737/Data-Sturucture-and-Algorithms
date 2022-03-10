package Graphs.GraphsUsingAdjacencyMatrix;

public class GraphNode {
    public String value;
    public int index;
    public boolean isVisited = false;

    GraphNode(String value,int index){
        this.index = index;
        this.value = value;
    }
}
