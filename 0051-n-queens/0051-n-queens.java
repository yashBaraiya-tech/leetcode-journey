class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char[][] board = new char[n][n];

        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }

        int colIdx = 0;

        solve(ans, board, colIdx, n);
        return ans;
    }

    static void solve(List<List<String>> ans, char[][] board, int colIdx, int n) {

        if (colIdx >= n) {
            List<String> tmp = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                tmp.add(new String(board[i]));

            }
            ans.add(tmp);
            return;
        }

        for (int rowIdx = 0; rowIdx < n; rowIdx++) {
            if (isSafe(rowIdx, colIdx, n, board)) {
                board[rowIdx][colIdx] = 'Q';
                solve(ans, board, colIdx + 1, n);
                board[rowIdx][colIdx] = '.';
            }
        }
    }

    static boolean isSafe(int rowIdx, int colIdx, int n, char[][] board) {

        // left
        int row = rowIdx;
        int col = colIdx;
        while (col >= 0) {
            if (board[row][col] == 'Q') {
                return false;
            }
            col--;
        }

        // upper left
        row = rowIdx;
        col = colIdx;
        while (col >= 0 && row >= 0) {
            if (board[row][col] == 'Q') {
                return false;
            }
            col--;
            row--;
        }

        // down right
        row = rowIdx;
        col = colIdx;
        while (col >= 0 && row < n) {
            if (board[row][col] == 'Q') {
                return false;
            }
            col--;
            row++;
        }

        return true;
    }
}
