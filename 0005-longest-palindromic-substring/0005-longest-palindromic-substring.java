class Solution {
    public String longestPalindrome(String s) {
        int max = Integer.MIN_VALUE;
        int n = s.length();
        int start = 0;
        int end = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (isPalidrom(s, i, j) && j - i + 1 > max) {
                    start = i;
                    end = j;
                    max = j - i + 1;
                }
            }
        }

        return s.substring(start, end + 1);
    }

    static boolean isPalidrom(String s, int i, int j) {
        while (i < j) {
            char charI = s.charAt(i);
            char charJ = s.charAt(j);

            if (charI != charJ)
                return false;

            i++;
            j--;
        }
        return true;
    }
}