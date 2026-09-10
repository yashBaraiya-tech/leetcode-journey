class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;

        int ans = 0;

        int max = Integer.MIN_VALUE;
        for (int e : piles) {
            if (e > max)
                max = e;
        }

        int s = 1;
        int e = max;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (isPossible(piles, h, mid)) {
                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }

        }

        return ans;

    }

    static boolean isPossible(int[] piles, int h, int mid) {
        // int result = (n + d - 1) / d;
        int n = piles.length;
        int result = 0;

        for (int i = 0; i < n; i++) {
            result += (piles[i] + mid - 1) / mid;
            if (result > h)
                return false;
        }

        return true;
    }
}