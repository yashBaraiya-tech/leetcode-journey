class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        ArrayList<Integer> ans = new ArrayList<>();

        for (int e : nums1) {
            set.add(e);
        }

        for (int e : nums2) {
            if (set.contains(e)) {
                ans.add(e);
                set.remove(e);
            }
        }

        int[] arr = new int[ans.size()];

        for (int i = 0; i < ans.size(); i++) {
            arr[i] = ans.get(i);
        }

        return arr;

    }
}