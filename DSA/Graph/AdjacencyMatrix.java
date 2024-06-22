package DSA.Graph;

public class AdjacencyMatrix {

    private int[][] graph;
    private int vertex;

    public  AdjacencyMatrix(int vertex){
        graph = new int[vertex][vertex];

        this.vertex = vertex;
    }

    // This is for unweighted and undirected graph
    public void addEdge(int u, int v){
        graph[u][v] = 1;
        graph[v][u] = 1;
    }

    public void display(){
        int i =0;
        for(int[] arr : graph){
            System.out.print(i+"=>");
            i++;
            for(int v : arr){
                System.out.print(v+" ");
            }
            System.out.println();
        }
    }
}
