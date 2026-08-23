class Solution {
    static boolean compare(int[] count1, int[] count2) {
        for (int i = 0; i < count1.length; i++) {
            if (count1[i] != count2[i])
                return false;
        }

        return true;
    }

    public boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length())
            return false;

        int count1[] = new int[26];
        int count2[] = new int[26];

        int windowSize = s1.length();

        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            count1[ch - 'a']++;
        }

        int i = 0;
        for (i = 0; i < windowSize; i++) {
            char ch = s2.charAt(i);
            count2[ch - 'a']++;
        }

        if (compare(count1, count2)) {
            return true;
        } else {
            while (i < s2.length()) {
                char newChar = s2.charAt(i);
                count2[newChar - 'a']++;

                char oldChar = s2.charAt(i - windowSize);
                count2[oldChar - 'a']--;

                if (compare(count1, count2)) {
                    return true;
                }

                i++;
            }
        }

        return false;
    }
}