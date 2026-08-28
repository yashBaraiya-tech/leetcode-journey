class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int row = items.size();
        int idx = 0;
        int ans = 0;

        switch (ruleKey) {
            case "type":
                idx = 0;
                break;

            case "color":
                idx = 1;
                break;
            case "name":
                idx = 2;
                break;
        }

        for (int i = 0; i < row; i++) {
            if (items.get(i).get(idx).equals(ruleValue)) {
                ans++;
            }
        }

        return ans;
    }
}