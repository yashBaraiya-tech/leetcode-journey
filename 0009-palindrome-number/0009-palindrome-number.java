class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        int reverse = 0;

        int n = x;
        while (n != 0) {
            reverse = reverse * 10 + n % 10;
            n /= 10;
        }

        if (reverse == x)
            return true;

        return false;

    }
}