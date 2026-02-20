import java.util.*;

public class StronglyCC {
    public static int koshaRaju(int v, ArrayList<ArrayList<Integer>> graph) {
        int Scc = 0;
        // filling the Stack;
        Stack<Integer> st = new Stack<>();
        boolean[] visit = new boolean[v];
        for (int i = 0; i < v; i++) {
            if (!visit[i]) {
                dfs1(i, graph, visit, st);
            }
        }
        // revers graph
        ArrayList<ArrayList<Integer>> reverse = new ArrayList<>();
        for (int i = 0; i < v; i++) {
            reverse.add(new ArrayList<>());
        }
        for (int i = 0; i < v; i++) {
            for (int j : graph.get(i)) {
                reverse.get(j).add(i);
            }
        }
        // filling the Array;
        Arrays.fill(visit, false);

        // cheking the reverse graph
        while (!st.isEmpty()) {
            int node = st.pop();
            if (!visit[node]) {
                dfs2(node, reverse, visit);
                Scc++;
            }
        }
        return Scc;
    }

    // for filling the st to traverse in the proper order not in random order
    public static void dfs1(int node, ArrayList<ArrayList<Integer>> graph, boolean[] visit, Stack<Integer> st) {
        visit[node] = true;
        for (int it : graph.get(node)) {
            if (!visit[it]) {
                dfs1(it, graph, visit, st);
            }
        }
        st.push(node);
    }

    // The second DFS is what actually extracts each Strongly Connected Component
    // (SCC).
    public static void dfs2(int node, ArrayList<ArrayList<Integer>> graph, boolean[] visit) {
        visit[node] = true;
        for (int it : graph.get(node)) {
            if (!visit[it]) {
                dfs2(it, graph, visit);
            }
        }
    }
}
