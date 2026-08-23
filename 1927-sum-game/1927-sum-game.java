class Solution {
    public boolean sumGame(String num) {
        int n = num.length();
        int leftSum = 0, rightSum = 0;
        int leftQ = 0, rightQ = 0;

        for (int i = 0; i < n / 2; i++) {
            if (num.charAt(i) == '?') {
                leftQ++;
            } else {
                leftSum += num.charAt(i) - '0';
            }
        }

        for (int i = n / 2; i < n; i++) {
            if (num.charAt(i) == '?') {
                rightQ++;
            } else {
                rightSum += num.charAt(i) - '0';
            }
        }

        int diff = leftSum - rightSum;
        int qDiff = leftQ - rightQ;

        // If the number of '?' is equal, Bob can win only
        // when the existing sums are already equal.
        if (qDiff == 0) {
            return diff != 0;
        }

        // Bob can balance the difference only when:
        // 2 * diff == 9 * (rightQ - leftQ)
        return 2 * diff != 9 * (rightQ - leftQ);
    }
}