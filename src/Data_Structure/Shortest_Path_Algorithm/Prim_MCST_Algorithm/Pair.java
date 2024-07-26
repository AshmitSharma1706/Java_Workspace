package Data_Structure.Shortest_Path_Algorithm.Prim_MCST_Algorithm;

public class Pair implements Comparable<Pair>{
    private int vertex;
    private int cost;
    public Pair(int vertex, int cost) {
        this.vertex = vertex;
        this.cost = cost;
    }

    public int getVertex() {
        return vertex;
    }

    public void setVertex(int vertex) {
        this.vertex = vertex;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public int compareTo(Pair o) {
        return this.cost-o.cost;
    }
}
