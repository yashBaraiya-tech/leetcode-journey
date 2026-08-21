class Solution {
    public int[] rowAndMaximumOnes(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;

        int max = 0;
        int ans = 0;

        for (int i = 0; i < row; i++) {

            int s = 0;
            int e = col - 1;
            Arrays.sort(arr[i]);

            while (s <= e) {
                int mid = s + (e - s) / 2;

                if (arr[i][mid] == 1) {
                    if (col - mid > max) {
                        max = col - mid;
                        ans = i;
                    }

                    e = mid - 1;
                } else {
                    s = mid + 1;
                }

            }

        }

        return new int[] { ans, max };
    }
}