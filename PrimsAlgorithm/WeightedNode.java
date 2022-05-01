package PrimsAlgorithm;

import java.util.ArrayList;
import java.util.HashMap;

public class WeightedNode implements Comparable<WeightedNode>{
    public String name;
    public int index;
    public boolean isVisited;
    public int distance;
    public WeightedNode parent;
    public ArrayList<WeightedNode>neighbours = new ArrayList<>();
    public HashMap<WeightedNode,Integer>weightMap = new HashMap<>();

    WeightedNode(String name,int index){
        this.name = name;
        this.index = index;
        this.distance = Integer.MAX_VALUE;
    }
    public int compareTo(WeightedNode o){
        return this.distance - o.distance;
    }

    public String toString(){
        return name;
    }
}
