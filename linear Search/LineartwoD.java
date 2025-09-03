public class LineartwoD {
    static int[] LinearSearch2D(int[][] arr, int target) {
        if (arr.length == 0) {
            return new int[] { -1, -1 };
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int target = 5;
        int[] ans = LinearSearch2D(arr, target);
        System.out.println("Target found at: [" + ans[0] + ", " + ans[1] + "]");
    }
}
