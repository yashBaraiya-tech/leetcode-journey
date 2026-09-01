class Solution {
    public int smallestNumber(int n, int t) {

        while (true) {
            int m = product(n);
            if (m % t == 0) {
                return n;
            }
            n++;
        }
       
    }

    static int product(int n) {
        int pro = 1;

        while (n != 0) {
            pro *= n % 10;
            n /= 10;
        }
        return pro;
    }
}