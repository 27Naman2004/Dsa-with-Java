public class BSin2D {
    static  int[] BinarrySearch(int[][] matrix, int target){
        int r = 0;
        int c = matrix.length - 1;
        while(r < matrix.length && c >= 0){
            if(matrix[r][c] == target){
                return new int[]{r,c};
            }
            if(matrix[r][c] > target){
                c--;
            }else{
                r++;
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int target = 5;
        int[] ans = BinarrySearch(matrix,target);
        System.out.println("Target found at: ");
        for(int i : ans){
            System.out.print(i + " ");
            
        }
    }
}
