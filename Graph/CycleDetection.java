import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CycleDetection {
    public boolean dfs(List<List<Integer>> arr, boolean[] visit, int node, int parent) {
        visit[node] = true;
        for (int i : arr.get(node)) {
            if (visit[i])
                return true;
            if (i == parent)
                continue;
            if (dfs(arr, visit, i, node))
                return true;
        }
        return false;
    }

    public boolean isCycle(List<List<Integer>> graph) {
        boolean[] visit = new boolean[graph.size()];
        for (int i = 0; i < graph.size(); i++) {
            if (!visit[i]) {
                if (dfs(graph, visit, i, -1)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vertices: ");
        int V = sc.nextInt();

        System.out.print("Enter number of edges: ");
        int E = sc.nextInt();

        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }

        System.out.println("Enter edges (u v):");

        for (int i = 0; i < E; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();

            graph.get(u).add(v);
            graph.get(v).add(u); // undirected
        }

        CycleDetection cd = new CycleDetection();

        if (cd.isCycle(graph)) {
            System.out.println("Cycle exists");
        } else {
            System.out.println("No cycle");
        }

        sc.close();
    }
}
