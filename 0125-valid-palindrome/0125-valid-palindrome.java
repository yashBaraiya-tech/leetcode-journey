class Solution {
    public boolean isPalindrome(String s) {
        if (s.length() == 1) {
            return true;
        }

        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                sb.append(ch);
            } else if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch - 'A' + 'a');
                sb.append(ch);
            } else if (ch >= '0' && ch <= '9') {
                sb.append(ch);
            }
        }

        int i = 0, j = sb.length() - 1;

        while (i < j) {
            int iChar = sb.charAt(i);
            int jChar = sb.charAt(j);

            if (iChar != jChar) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}