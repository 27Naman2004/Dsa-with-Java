public class CycleDetectionUsingDSU {
    int parent[];
    class DSU{
        DSU(int n){
            parent = new int[n];
            for(int i=0;i<n;i++){
                parent[i] = i;
            }
        }
        int find(int x){
            if(parent[x] != x){
                return x;
            }
            return parent[x] = find(parent[x]);
        }
        void union(int x, int y){
            int px = find(x);
            int py = find(y);
            
            if(px != py){
                parent[px] = py;
            }
        }
    }
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
