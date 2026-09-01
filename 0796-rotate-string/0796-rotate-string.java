class Solution {
    public boolean rotateString(String s, String goal) {
        String concat = goal + goal;

        return concat.contains(s);
    }
}