class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;

        int curRow = 0;
        int curCol = col - 1;

        while (curRow < row && curCol >= 0) {
            if (matrix[curRow][curCol] == target) {
                return true;
            } else if (matrix[curRow][curCol] > target) {
                curCol--;
            } else {
                curRow++;
            }
        }

        return false;
    }
}