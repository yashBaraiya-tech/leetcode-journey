class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0;
        int product = 1;

        int m=n;

        while (m != 0) {
            int digit = m % 10;
            sum += digit;
            product *= digit;
            m /= 10;
        }

        if (n % (sum + product) == 0)
            return true;
        else
            return false;

    }
}