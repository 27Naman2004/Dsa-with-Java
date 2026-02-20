public class CycleDetectionUsingDSU {
    public boolean hasCycle(int n, int[][] edges) {
        DSU dsu = new DSU(n);

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];

            if (dsu.find(u) == dsu.find(v)) {
                return true; // cycle found
            }

            dsu.union(u, v);
        }

        return false;
    }
    public static void main(String[] args){

    }
}
