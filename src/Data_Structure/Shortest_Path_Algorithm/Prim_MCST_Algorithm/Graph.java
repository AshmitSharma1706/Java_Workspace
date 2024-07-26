package Data_Structure.Shortest_Path_Algorithm.Prim_MCST_Algorithm;

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
    public void Prim(int source){
        boolean[] visited=new boolean[myList.length];
        PriorityQueue<Pair> pq=new PriorityQueue<>();
        Pair start=new Pair(source,0);
        pq.add(start);
        int totalCost=0;
        while(!pq.isEmpty()){
            Pair current=pq.remove();
            if(!visited[current.getVertex()]){
                visited[current.getVertex()]=true;
                totalCost+= current.getCost();
                List<Edge> adj=myList[current.getVertex()];
                for(Edge e:adj){
                    Pair p=new Pair(e.getDestination(),e.getWeight());
                    pq.add(p);
                }
            }
        }
        System.out.println("Minimum cost of Spanning tree is: "+totalCost);
    }
}
