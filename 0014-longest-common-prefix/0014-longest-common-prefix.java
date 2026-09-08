class Solution {
    public String longestCommonPrefix(String[] strs) {
        String pre = strs[0];
        String curr = "";

        for (int i = 1; i < strs.length; i++) {
            int j = 0;

            while (j < pre.length() && j < strs[i].length() && pre.charAt(j) == strs[i].charAt(j)) {
                curr += pre.charAt(j);
                j++;
            }

            pre = curr;
            curr = "";
        }

        return pre;
    }
}