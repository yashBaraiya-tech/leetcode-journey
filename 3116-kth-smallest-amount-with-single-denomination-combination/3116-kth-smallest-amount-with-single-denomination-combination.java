import java.util.*;

class Solution {

    public long findKthSmallest(int[] coins, int k) {

        long low = 1;

        // Maximum possible answer:
        // k multiples of the smallest coin
        long high = (long) Arrays.stream(coins).min().getAsInt() * k;

        while (low < high) {

            long mid = low + (high - low) / 2;

            // At least k amounts can be made <= mid
            if (count(coins, mid) >= k) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    // Number of distinct amounts <= n
    // that are divisible by at least one coin
    private long count(int[] coins, long n) {

        int m = coins.length;
        long ans = 0;

        // Generate every non-empty subset
        for (int mask = 1; mask < (1 << m); mask++) {

            long lcm = 1;
            int bits = 0;

            for (int i = 0; i < m; i++) {

                if ((mask & (1 << i)) != 0) {

                    bits++;

                    long g = gcd(lcm, coins[i]);

                    // Avoid long overflow
                    long value = coins[i] / g;

                    if (lcm > n / value) {
                        lcm = n + 1;
                        break;
                    }

                    lcm *= value;
                }
            }

            // No multiple of this LCM can be <= n
            if (lcm > n) {
                continue;
            }

            long multiples = n / lcm;

            // Inclusion-Exclusion
            if (bits % 2 == 1) {
                ans += multiples;
            } else {
                ans -= multiples;
            }
        }

        return ans;
    }

    private long gcd(long a, long b) {

        while (b != 0) {
            long temp = a % b;
            a = b;
            b = temp;
        }

        return a;
    }
}