import java.util.*;
public class WithWeightedGraphCreation {
    static class Edge{
        int src;
        int des;
        int wt;
        public Edge(int src, int des, int wt){
            this.src = src;
            this.des = des;
            this.wt = wt;
        }
    }
    public static void creategraph(ArrayList<Edge> graph[]){
        for(int i=0; i< graph.length;i++){
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0,2,1));
        graph[1].add(new Edge(1,2,10));
        graph[1].add(new Edge(1,3,19));
        graph[2].add(new Edge(2,0,11));
        graph[2].add(new Edge(2,1,12));
        graph[2].add(new Edge(2,3,12));
        graph[3].add(new Edge(3,1,45));
        graph[3].add(new Edge(3,2,43));

    }
    public static void main(String[] args) {
        
        int v = 4;
        ArrayList<Edge>graph[] = new ArrayList[v];
        creategraph(graph);

        // printting 2's  nei;
        for(int i=0;i<graph[2].size();i++){
            Edge e = graph[2].get(i);
            System.out.println( e.src + "->" + e.des + " , " + e.wt);
        }
    }
}


