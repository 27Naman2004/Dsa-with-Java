import java.util.ArrayList;
import java.util.List;

public class DFSTraversal {

    public static void dfs(List<List<Integer>> adj, List<Integer> res, int node, boolean[] visit) {
        visit[node] = true;
        res.add(node);

        for (int neighbour : adj.get(node)) {
            if (!visit[neighbour]) {
                dfs(adj, res, neighbour, visit);
            }
        }
    }

    public static void main(String[] args) {

        int vertices = 6; // changed number of vertices

        // Edge list (u, v)
        int[][] edges = {
                { 0, 1 },
                { 0, 2 },
                { 1, 3 },
                { 4, 5 }
        };

        // Create adjacency list
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            adj.add(new ArrayList<>());
        }

        // Add edges
        for (int[] edge : edges) {
            addEdge(adj, edge[0], edge[1]);
        }

        boolean[] visit = new boolean[vertices];
        List<Integer> ans = new ArrayList<>();

        // Handle disconnected components
        for (int i = 0; i < vertices; i++) {
            if (!visit[i]) {
                dfs(adj, ans, i, visit);
            }
        }

        System.out.println(ans);
    }

    public static void addEdge(List<List<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
}
