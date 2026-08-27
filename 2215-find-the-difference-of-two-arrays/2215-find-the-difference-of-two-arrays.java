class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans = new ArrayList<>();

        List<Integer> ans1 = new ArrayList<>();
        List<Integer> ans2 = new ArrayList<>();

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int e : nums1) {
            set1.add(e);
        }

        for (int e : nums2) {
            set2.add(e);
        }

        for (int e : set1) {
            if (!set2.contains(e)) {
                ans1.add(e);
            }
        }

        for (int e : set2) {
            if (!set1.contains(e)) {
                ans2.add(e);
            }
        }

        ans.add(ans1);
        ans.add(ans2);

        return ans;
    }
}