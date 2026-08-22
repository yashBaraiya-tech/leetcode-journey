import java.util.Hashtable;

class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] ans = new int[2];

        Hashtable<Integer, Boolean> table = new Hashtable<>();

        int row = grid.length;
        int col = grid[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                if (!table.containsKey(grid[i][j])) {
                    table.put(grid[i][j], true);
                } else {
                    ans[0] = grid[i][j];
                }
            }
        }

        for (int key = 1; key <= row * col; key++) {
            if (!table.containsKey(key)) {
                ans[1] = key;
                break;
            }
        }

        return ans;
    }
}