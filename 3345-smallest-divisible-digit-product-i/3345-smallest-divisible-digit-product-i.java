class Solution {
    public int smallestNumber(int n, int t) {
        for (;; n++) {
            int x = n, product = 1;

            while (x > 0) {
                product *= x % 10;
                x /= 10;
            }

            if (product % t == 0)
                return n;
        }
    }
}