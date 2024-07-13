package Data_Structure.Graph.Graph_Traversal.BFS;

import java.util.*;

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
    public void bfs(int s){
        boolean [] visited=new boolean[myList.length];
        Queue<Integer> adjacent=new LinkedList<>();
        adjacent.add(s);
        while (!adjacent.isEmpty()){
            int vertex=adjacent.remove();
            if(!visited[vertex]){
                System.out.println(vertex);
                visited[vertex]=true;
                List<Edge> edgeList=myList[vertex];
                for (Edge e: edgeList){
                    adjacent.add(e.getDestination());
                }
            }
        }
    }
}
