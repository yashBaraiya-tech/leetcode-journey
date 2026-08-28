class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<>();
        int max = Integer.MIN_VALUE;

        for (int e : candies) {
            max = Math.max(max, e);
        }

        for (int e : candies) {
            if (max <= e + extraCandies)
                ans.add(true);
            else
                ans.add(false);
        }

        return ans;
    }
}