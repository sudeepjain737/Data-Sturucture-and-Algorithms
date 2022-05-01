package DijkstraAlgorithm;

import java.util.ArrayList;
import java.util.HashMap;

public class WeightedNode implements Comparable<WeightedNode>{
    public  String name;
    public int index;
    public boolean isVisited;
    public WeightedNode parent;
    ArrayList<WeightedNode>neighbours = new ArrayList<>();
    HashMap<WeightedNode,Integer>weightMap = new HashMap<>();
    public int distance;

    WeightedNode(String name,int index){
        this.name = name;
        this.index = index;
        this.distance = Integer.MAX_VALUE;
    }

    public String toString(){
        return name;
    }

    public int compareTo(WeightedNode o) {
        return this.distance - o.distance;
    }
}
