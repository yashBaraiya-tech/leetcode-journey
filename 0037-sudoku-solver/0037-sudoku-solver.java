class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }

    static boolean solve(char[][] board) {

        int[] empty = new int[2];
        if (!findempty(board, empty)) {
            return true;
        }

        int rowIdx = empty[0];
        int colIdx = empty[1];

        for (int value = 1; value <= 9; value++) {
            char charValue = (char) (value + '0');
            if (isSafe(charValue, board, rowIdx, colIdx)) {
                board[rowIdx][colIdx] = charValue;

                if (solve(board) == true) {
                    return true;
                }
                board[rowIdx][colIdx] = '.';
            }
        }

        return false;
    }

    static boolean findempty(char[][] board, int[] empty) {

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    empty[0] = i;
                    empty[1] = j;
                    return true;
                }
            }
        }

        return false;
    }

    static boolean isSafe(char charValue, char[][] board, int rowIdx, int colIdx) {

        // column 
        for (int col = 0; col < 9; col++) {
            if (board[rowIdx][col] == charValue)
                return false;
        }

        // row
        for (int row = 0; row < 9; row++) {
            if (board[row][colIdx] == charValue)
                return false;
        }
        // subMatrix 3 x 3
        int startRow = rowIdx - rowIdx % 3;
        int startCol = colIdx - colIdx % 3;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int actuatRow = startRow + i;
                int actuatCol = startCol + j;
                if (board[actuatRow][actuatCol] == charValue)
                    return false;
            }
        }

        return true;

    }
}