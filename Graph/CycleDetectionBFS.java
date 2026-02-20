import java.util.*;

class Pair {
    int v;
    int parent;

    Pair(int v, int parent) {
        this.v = v;
        this.parent = parent;
    }
}

public class CycleDetectionBFS {
    // Approach:
    // 1. Queue lo and visited array rako or queue mai parent dalao parent and pair
    // ke sth ager cisited nh h to angle bado or bds lagao
    public static boolean isCycle(int n, List<List<Integer>> graph) {
        boolean[] visited = new boolean[n];
        Queue<Pair> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                queue.add(new Pair(i, -1));
                visited[i] = true;
                while (!queue.isEmpty()) {
                    Pair p = queue.poll();
                    int v = p.v;
                    int parent = p.parent;
                    for (int it : graph.get(v)) {
                        if (!visited[it]) {
                            visited[it] = true;
                            queue.add(new Pair(it, v));
                        } else if (it != parent) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
