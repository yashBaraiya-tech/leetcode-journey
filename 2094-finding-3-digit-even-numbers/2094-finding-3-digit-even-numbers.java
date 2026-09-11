class Solution {
    public int[] findEvenNumbers(int[] digits) {
        int[] freq = new int[10];
        ArrayList<Integer> ans = new ArrayList<>();

        for (int e : digits) {
            freq[e]++;
        }

        for (int i = 1; i <= 9; i++) {
            // hundreds
            if (freq[i] == 0)
                continue;

            freq[i]--;

            for (int j = 0; j <= 9; j++) {
                // tens
                if (freq[j] == 0)
                    continue;

                freq[j]--;

                for (int k = 0; k <= 8; k += 2) {
                    // units
                    if (freq[k] > 0) {
                        int num = i * 100 + j * 10 + k;
                        ans.add(num);
                    }
                }

                freq[j]++;
            }

            freq[i]++;
        }

        // ArrayList<Integer> -> int[]
        int[] result = new int[ans.size()];

        for (int i = 0; i < ans.size(); i++) {
            result[i] = ans.get(i);
        }

        return result;
    }
}