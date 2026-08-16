class Solution {
    public int[][] constructProductMatrix(int[][] grid) {

        int rows = grid.length;
        int cols = grid[0].length;
        int MOD = 12345;

        int[][] ans = new int[rows][cols];

        // Prefix product
        long product = 1;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                ans[i][j] = (int) product;

                product = (product * grid[i][j]) % MOD;
            }
        }

        // Suffix product
        product = 1;

        for (int i = rows - 1; i >= 0; i--) {
            for (int j = cols - 1; j >= 0; j--) {

                ans[i][j] = (int) ((ans[i][j] * product) % MOD);

                product = (product * grid[i][j]) % MOD;
            }
        }

        return ans;
    }
}