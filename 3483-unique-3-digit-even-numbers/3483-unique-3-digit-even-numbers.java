class Solution {
    public int totalNumbers(int[] digits) {
        int freq[] = new int[10];

        for (int e : digits) {
            freq[e]++;
        }

        int ans = 0;

        for (int i = 1; i <= 9; i++) {
            // hundred
            if (freq[i] == 0)
                continue;
            freq[i]--;

            for (int j = 0; j <= 9; j++) {
                // tenth
                if (freq[j] == 0)
                    continue;
                freq[j]--;

                for (int k = 0; k <= 8; k = k + 2) {
                    // unit
                    if (freq[k] > 0)
                        ans++;
                }
                freq[j]++;
            }
            freq[i]++;
        }

        return ans;
    }
}