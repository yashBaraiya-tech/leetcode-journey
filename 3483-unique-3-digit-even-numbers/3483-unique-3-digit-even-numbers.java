class Solution {
    public int totalNumbers(int[] digits) {
        int[] freq = new int[10];

        for (int d : digits) {
            freq[d]++;
        }

        int ans = 0;

        // Choose units digit (must be even)
        for (int e = 0; e <= 8; e += 2) {
            if (freq[e] == 0) continue;

            // Choose hundreds digit (cannot be 0)
            for (int h = 1; h <= 9; h++) {
                if (freq[h] == 0) continue;
                if (h == e && freq[h] < 2) continue;

                // Choose tens digit
                for (int t = 0; t <= 9; t++) {
                    if (freq[t] == 0) continue;

                    int need = 1;

                    if (t == e) need++;
                    if (t == h) need++;

                    if (freq[t] >= need) {
                        ans++;
                    }
                }
            }
        }

        return ans;
    }
}