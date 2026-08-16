class Solution {
    public int[][] generateMatrix(int n) {
        int matrix[][] = new int[n][n];

        int fc = 0;
        int lc = n - 1;
        int fr = 0;
        int lr = n - 1;
        int N = 1;

        while (fr <= lr && fc <= lc) {

            // Left to right
            for (int i = fc; i <= lc; i++) {
                matrix[fr][i] = N++;
            }
            fr++;

            // Top to bottom
            for (int i = fr; i <= lr; i++) {
                matrix[i][lc] = N++;
            }
            lc--;

            // Right to left
            if (fr <= lr) {
                for (int i = lc; i >= fc; i--) {
                    matrix[lr][i] = N++;
                }
                lr--;
            }

            // Bottom to top
            if (fc <= lc) {
                for (int i = lr; i >= fr; i--) {
                    matrix[i][fc] = N++;
                }
                fc++;
            }
        }

        return matrix;
    }
}