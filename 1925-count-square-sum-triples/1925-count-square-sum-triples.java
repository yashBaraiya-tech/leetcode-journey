class Solution {
    public int countTriples(int n) {
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int squre = i * i + j * j;
                int c = (int) Math.sqrt(squre);

                if (c <= n && c * c == squre)
                    ans++;
            }
        }

        return ans;
    }
}