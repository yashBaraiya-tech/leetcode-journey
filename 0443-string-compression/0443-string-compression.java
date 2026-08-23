class Solution {
    public int compress(char[] chars) {
        int i = 0;
        int j = 1;

        String s = "";

        while (i < chars.length && j < chars.length) {
            if (chars[i] == chars[j]) {
                j++;
            } else {
                int count = j - i;
                s += chars[i];

                if (count > 1)
                    s += count;
                i = j;

            }

        }
        int count = j - i;
        s += chars[i];

        if (count > 1)
            s += count;

        for (int k = 0; k < s.length(); k++) {
            chars[k] = s.charAt(k);
        }

        return s.length();
    }
}