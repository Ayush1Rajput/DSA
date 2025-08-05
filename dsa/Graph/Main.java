package dsa.Graph;

public class Main {

    public static void main(String[] args) {

//        AdjacencyMatrix g = new AdjacencyMatrix(5);
//
//        g.addEdge(0,1);
//        g.addEdge(0,2);
//        g.addEdge(2,3);
//        g.addEdge(3,1);
//        g.addEdge(3,4);
//        g.addEdge(1,4);
//
//        g.display();
//
//        System.out.println(a);

        AdjacencyList g = new AdjacencyList(5);

        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(2,3);
        g.addEdge(3,1);
        g.addEdge(3,4);
        g.addEdge(1,4);
//        g.print();

        g.bfs(g,0);
        System.out.println();
        g.dfs(g,0);
        System.out.println();
        g.isCycle(g,0);
        
    }
}