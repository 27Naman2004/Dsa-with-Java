import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.LinkedList;

public class BFSTraversal {

    // for conected Component
    public static void bfs(List<List<Integer>> adj, List<Integer> res, int node, boolean[] visit) {
        Queue<Integer> q = new LinkedList<>();
        q.add(node);
        visit[node] = true;

        while (!q.isEmpty()) {
            int curr = q.poll();
            res.add(curr);

            for (int neighbour : adj.get(curr)) {
                if (!visit[neighbour]) {
                    visit[neighbour] = true;
                    q.add(neighbour);
                }
            }
        }
    }

    // for Disconected Component also
    public ArrayList<Integer> bfsOfGraph(int V, List<List<Integer>> adj) {
        boolean[] visited = new boolean[V];
        ArrayList<Integer> result = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                visited[i] = true;
                queue.offer(i);

                while (!queue.isEmpty()) {
                    int node = queue.poll();
                    result.add(node);

                    for (int neighbor : adj.get(node)) {
                        if (!visited[neighbor]) {
                            visited[neighbor] = true;
                            queue.offer(neighbor);
                        }
                    }
                }
            }
        }

        return result;
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
        bfs(adj, ans, 0, visit);

        System.out.println(ans);

    }

    public static void addEdge(List<List<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
}
