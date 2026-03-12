public class MCM {
    // Matrix chain Multiplication
    public static void MCM(int[] p) {
        int n = p.length - 1; // Number of matrices
        int[][] m = new int[n + 1][n + 1];
        int[][] s = new int[n + 1][n + 1];

        // cost is 0 when multiplying one matrix
        for (int i = 1; i <= n; i++) {
            m[i][i] = 0;
        }

        // L is chain length
        for (int L = 2; L <= n; L++) {
            for (int i = 1; i <= n - L + 1; i++) {
                int j = i + L - 1;
                m[i][j] = Integer.MAX_VALUE;

                for (int k = i; k <= j - 1; k++) {
                    // q = cost/scalar multiplications
                    int q = m[i][k] + m[k + 1][j] + (p[i - 1] * p[k] * p[j]);

                    if (q < m[i][j]) {
                        m[i][j] = q;
                        s[i][j] = k; // Store the split point
                    }
                }
            }
        }

        System.out.println("Minimum cost is: " + m[1][n]);
        System.out.print("Optimal Parenthesization: ");
        printParenthesis(s, 1, n);
    }

    // Helper method to print the order of multiplication
    private static void printParenthesis(int[][] s, int i, int j) {
        if (i == j) {
            System.out.print("A" + i);
        } else {
            System.out.print("(");
            printParenthesis(s, i, s[i][j]);
            printParenthesis(s, s[i][j] + 1, j);
            System.out.print(")");
        }
    }

    public static void main(String[] args) {
        // Dimensions: Matrix A1 is 10x30, A2 is 30x5, A3 is 5x60
        int[] arr = { 10, 30, 5, 60 };
        MCM(arr);
    }
}