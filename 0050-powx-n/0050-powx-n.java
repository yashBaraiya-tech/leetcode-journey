class Solution {
    public double myPow(double x, int n) {
        long exe = n;

        if (exe < 0) {
            exe = -exe;
            x = 1 / x;
        }

        return power(x, exe);

    }

    static double power(double x, long exe) {

        if (exe == 0) {
            return 1.0;
        }

        double half = power(x, exe / 2);

        if (exe % 2 == 0) {
            return half * half;
        } else {
            return half * half * x;
        }
    }
}