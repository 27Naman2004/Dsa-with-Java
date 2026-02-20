
//  Graph Representation
import java.util.*;

public class First {
    public static void main(String[] args) {
        // Using adj matrix;
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            adj.add(new ArrayList<>());
        }
        addEdge(adj, 0, 1);
        addEdge(adj, 0, 2);
        addEdge(adj, 1, 2);
        addEdge(adj, 2, 3);
        printGraph(adj);

        // Using adj matrix;
        int[][] adjMatrix = new int[5][5];
        addEdge(adjMatrix, 0, 1);
        addEdge(adjMatrix, 0, 2);
        addEdge(adjMatrix, 1, 2);
        addEdge(adjMatrix, 2, 3);
        addEdge(adjMatrix, 3, 4);
        printGraph(adjMatrix);
    }

    public static void addEdge(int[][] adjMatrix, int u, int v) {
        adjMatrix[u][v] = 1;
        adjMatrix[v][u] = 1;
    }

    public static void printGraph(int[][] adjMatrix) {
        System.out.println("Using Matrix");
        for (int i = 0; i < adjMatrix.length; i++) {
            System.out.print(i + " -> ");
            for (int j = 0; j < adjMatrix[i].length; j++) {
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void addEdge(List<List<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    public static void printGraph(List<List<Integer>> adj) {
        System.out.println("Using List");
        for (int i = 0; i < adj.size(); i++) {
            System.out.print(i + " -> ");
            for (int j = 0; j < adj.get(i).size(); j++) {
                System.out.print(adj.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}