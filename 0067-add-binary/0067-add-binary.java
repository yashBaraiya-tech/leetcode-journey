class Solution {
    public String addBinary(String a, String b) {
        int carry = 0;
        String ans = "";

        int n = a.length();
        int m = b.length();

        int i = n - 1;
        int j = m - 1;

        while (i >= 0 && j >= 0){
            int I = a.charAt(i) - '0';
            int J = b.charAt(j) - '0';

            if (I == 1 && J == 1) {
                if (carry == 1) {
                    ans += '1';
                } else {
                    ans += '0';
                }
                carry = 1;
            } else if ((I == 1 && J == 0) || (I == 0 && J == 1)) {
                if (carry == 1) {
                    ans += '0';
                    carry = 1;
                } else {
                    ans += '1';
                    carry = 0;
                }
            } else if (I == 0 && J == 0) {
                if (carry == 1) {
                    ans += '1';
                } else {
                    ans += '0';
                }
                carry = 0;
            }
            i--;
            j--;
        }

        while (i >= 0) {
            int I = a.charAt(i) - '0';

            if (I == 1) {
                if (carry == 1) {
                    ans += 0;
                    carry = 1;
                } else {
                    ans += 1;
                    carry = 0;
                }
            }

            if (I == 0) {
                if (carry == 1) {
                    ans += 1;
                    carry = 0;
                } else {
                    ans += 0;
                    carry = 0;
                }
            }
            i--;
        }

        while (j >= 0) {
            int J = b.charAt(j) - '0';

            if (J == 1) {
                if (carry == 1) {
                    ans += 0;
                    carry = 1;
                } else {
                    ans += 1;
                    carry = 0;
                }
            }

            if (J == 0) {
                if (carry == 1) {
                    ans += 1;
                    carry = 0;
                } else {
                    ans += 0;
                    carry = 0;
                }
            }
            j--;
        }

        if (carry == 1) {
            ans += '1';
        }

        return new StringBuilder(ans).reverse().toString();
    }
}