package SSSPPUsingBFS.UsingAdjacencyMatrix;

public class GraphNode {
    public String value;
    public int index;
    public boolean isVisited;
    public GraphNode parent;

    GraphNode(String value,int index){
        this.index = index;
        this.value = value;
    }
}
