public class SortedMatrixBS {

    // search in a row provided
    static int[] BinarrySearch(int[][] matrix, int target, int row, int cStart, int cEnd){
        while(cStart <= cEnd){
            int mid = cStart + (cEnd - cStart)/2;
            if(matrix[row][mid] == target){
                return new int[]{row, mid};
            }
            if(matrix[row][mid] < target){
                cStart = mid + 1;
            }else{
                cEnd = mid - 1;
            }
        }
        return new int[]{-1,-1};
    }
    static int[] search(int [][] mat, int target){
        int rows = mat.length;
        int cols = mat[0].length; // becoz matrix is not empty
        if(rows==1){
            return BinarrySearch(mat, target, 0, 0, cols-1);
        }
        // run the loop till 2 rows are remaining
        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols / 2;
        while(rStart < (rEnd - 1)){ // while this is true it will have more than 2 rows
            int mid = rStart + (rEnd - rStart) / 2;
            if(mat[mid][cMid] == target){
                return new int[]{mid, cMid};
            }
            if(mat[mid][cMid] < target){
                rStart = mid;
            }else{
                rEnd = mid;
            }
        }
        // now we have 2 rows
        // check whether the target is in the col of 2 rows
        if(mat[rStart][cMid] == target){
            return new int[]{rStart, cMid};
        }
        if(mat[rStart + 1][cMid] == target){
            return new int[]{rStart + 1, cMid};
        }
        // search in 1st half
        if(target <= mat[rStart][cMid - 1]){
            return BinarrySearch(mat, target, rStart, 0, cMid - 1);
        }
        // search in 2nd half
        if(target >= mat[rStart][cMid + 1] && target <= mat[rStart][cols - 1]){
            return BinarrySearch(mat, target, rStart,   cMid + 1, cols - 1);
        }
        // search in 3rd half
        if(target <= mat[rStart + 1][cMid - 1]){
            return BinarrySearch(mat, target, rStart + 1, 0, cMid - 1);
        }else{
            return BinarrySearch(mat, target, rStart + 1, cMid + 1, cols - 1);
        }
    }
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15},
                {16,17,18,19,20}
        };
        int target = 14;
        int[] ans = search(matrix,target);
        System.out.println("Target found at: ");
        for(int i : ans){
            System.out.print(i + " ");

        }
    }
}
