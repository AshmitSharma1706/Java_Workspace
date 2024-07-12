package Data_Structure.Graph.Adjacency_List;

import java.util.ArrayList;
import java.util.List;

public class Graph {
    private List<Edge> [] myList;
    public Graph(int size){
        myList=new ArrayList[size];
        for(int i=0; i<size; i++){
            myList[i]=new ArrayList<Edge>();
        }
    }

    public void add(int index, Edge e){
        myList[index].add(e);
    }
}
