class Solution {
    public boolean rotateString(String s, String goal) {

        if (s.length() != goal.length())
            return false;

        String concat = goal + goal;

        return concat.contains(s);
    }
}