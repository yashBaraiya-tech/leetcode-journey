class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();

        int row = matrix.length;
        int col = matrix[0].length;

        int fc = 0;
        int lc = col - 1;
        int fr = 0;
        int lr = row - 1;

        while (fr <= lr && fc <= lc) {

            // Left to right
            for (int i = fc; i <= lc; i++) {
                ans.add(matrix[fr][i]);
            }
            fr++;

            // Top to bottom
            for (int i = fr; i <= lr; i++) {
                ans.add(matrix[i][lc]);
            }
            lc--;

            // Right to left
            if (fr <= lr) {
                for (int i = lc; i >= fc; i--) {
                    ans.add(matrix[lr][i]);
                }
                lr--;
            }

            // Bottom to top
            if (fc <= lc) {
                for (int i = lr; i >= fr; i--) {
                    ans.add(matrix[i][fc]);
                }
                fc++;
            }
        }

        return ans;
    }
}