package dsa.Graph;

import java.util.*;

public class AdjacencyList {
    ArrayList<Integer>[] graph ;

    public AdjacencyList(int v){
        graph = new ArrayList[v];

        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<Integer>();
        }
    }

    public  void addEdge(int u, int v){
        graph[u].add(v);
        graph[v].add(u);
    }

    public void print(){
        int i = 0;
        for(ArrayList<Integer> list : graph){
            System.out.println(i+" => "+list);
            i++;
        }
    }

    public static void bfs(AdjacencyList g, int s){
        boolean[] isVisited = new boolean[g.graph.length];

        Queue<Integer> q = new LinkedList<Integer>();

        q.offer(s);

        while(!q.isEmpty()){
            int i = q.poll();
            if(isVisited[i] == false){
                isVisited[i] = true;
                System.out.print(i+" ");

                for(Integer v : g.graph[i]){
                    q.offer(v);
                }
            }
        }
    }


    public static void dfs(AdjacencyList g, int s){
        boolean[] isVisited = new boolean[g.graph.length];

       Stack<Integer> st = new Stack<>();

        st.push(s);

        while(!st.isEmpty()){
            int i = st.pop();
            if(isVisited[i] == false){
                isVisited[i] = true;
                System.out.print(i+" ");

                for(Integer v : g.graph[i]){
                    if(isVisited[v]==false){
                        st.push(v);
                    }
                }
            }
        }
    }


    public static void isCycle(AdjacencyList g, int s){
        boolean[] isVisited = new boolean[g.graph.length];

        Stack<Integer> st = new Stack<>();

        st.push(s);
        boolean flag = true;

        while(!st.isEmpty()){
            int i = st.pop();
            if(isVisited[i] == false){
                isVisited[i] = true;
                System.out.print(i+" ");

                for(Integer v : g.graph[i]){
                    if(isVisited[v] == false && st.indexOf(v)>=0){
                        flag=false;
                        break;
                    }
                    if(isVisited[v]==false){
                        st.push(v);
                    }
                }
            }
        }
        if(flag){
            System.out.println("Yes there is a Cycle");
        }else{
            System.out.println("No there is no cycle");
        }
    }

}
