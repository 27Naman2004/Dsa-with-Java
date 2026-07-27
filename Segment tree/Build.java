import java.util.Arrays;

public class Build{

    // Build the segment tree from the given array
    void buildSegmentTree(int [] arr, int [] segTree, int node, int start, int end){

        if(start == end){
            segTree[node] = arr[start];
            return;
        }
        int mid = (start+end)/2;
        // 0 Base Indexing
        buildSegmentTree(arr, segTree, 2*node+1, start, mid);
        buildSegmentTree(arr, segTree, 2*node+2, mid+1, end);

        // 1 Base Indexing
        /*
            buildSegmentTree(arr, segTree, 2*node, start, mid);
            buildSegmentTree(arr, segTree, 2*node+1, mid+1, end);
        */

        segTree[node] = segTree[2*node+1] + segTree[2*node+2];
    }
    // Update the value at a specific index in the segment tree
    void update(int[] arr, int segTree[], int node, int st, int end, int valToUpdate,  int updateIndex){
        if(st == end){
            segTree[node] = valToUpdate;
            return;
        }

        int mid = (st + end)/2;

        if(updateIndex <= mid){
            update(arr, segTree, 2*node+1, st, mid, valToUpdate, updateIndex);
        } else {
            update(arr, segTree, 2*node+2, mid+1, end, valToUpdate, updateIndex);
        }

        segTree[node] = segTree[2*node+1] + segTree[2*node+2];
    }
    public static void main(String[] args){
        int[] arr = {2, 3, 4, 6};
        int n = arr.length;
        
        // Segment tree array size should be 4 * n to prevent out-of-bounds but can be 2 * n
        int[] segTree = new int[2 * n];
        
        Build build = new Build();
        // Build the segment tree
        build.buildSegmentTree(arr, segTree, 0, 0, n - 1);

        // Update the value at index 3 to 10
        build.update(arr, segTree, 0, 0, n - 1, 10, 3);

        int [][] queries = {
            {0, 10}, // Update index 0 to value 10
            {1, 5}, // Update index 1 to value 5
            {2, 9}, // Update index 2 to value 9
            {3, 11} // Update index 3 to value 11
        };
        for(int i[]: queries){
            int updateIndex = i[0];
            int ValToUpdate = i[1];
            build.update(arr, segTree, 0, 0, n - 1, ValToUpdate, updateIndex);
        }
        System.out.println("Root Node Sum: " + segTree[0]);

        System.out.println("Tree: " + Arrays.toString(segTree));
    }
}