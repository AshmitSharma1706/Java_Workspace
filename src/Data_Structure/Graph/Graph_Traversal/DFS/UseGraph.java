package Data_Structure.Graph.Graph_Traversal.DFS;

public class UseGraph {
    public static void main(String[] args) {
        Graph g=new Graph(5);

//      Adding adjacent edges of vertex 0.
        g.add(0,new Edge(0,1,6));

//      Adding adjacent edges of vertex 1.
        g.add(1,new Edge(1,0,6));
        g.add(1,new Edge(1,2,2));
        g.add(1,new Edge(1,3,3));

//      Adding adjacent edges of vertex 2.
        g.add(2,new Edge(2,1,2));
        g.add(2,new Edge(2,3,1));
        g.add(2,new Edge(2,4,4));

//      Adding adjacent edges of vertex 3.
        g.add(3,new Edge(3,1,3));
        g.add(3,new Edge(3,2,1));

//      Adding adjacent edges of vertex 4.
        g.add(4,new Edge(4,2,4));

        System.out.println("DFS tree traversal:");
        g.dfs(0);
    }
}
