package BellmanFordAlgorithm;

import java.util.ArrayList;
import java.util.HashMap;

public class WeightedNode implements Comparable<WeightedNode> {
    public boolean isVisited;
    public int index;
    public String name;
    ArrayList<WeightedNode>neighbours = new ArrayList<>();
    HashMap<WeightedNode,Integer>weightMap = new HashMap<>();
    public WeightedNode parent;
    public int distance;

    WeightedNode(String name,int index){
        this.name = name;
        this.index = index;
        this.distance = Integer.MAX_VALUE;
    }



    public int compareTo(WeightedNode o) {
        return this.distance - o.distance;
    }

    public String toString(){
        return name;
    }
}
