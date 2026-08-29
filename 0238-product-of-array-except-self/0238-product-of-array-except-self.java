class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int left[] = new int[n];
        int right[] = new int[n];
        int ans[] = new int[n];

        int l = 1;
        int r = 1;

        for (int i = 0; i < n; i++) {
            left[i] = l;
            l *= nums[i];
        }

        for (int i = n - 1; i >= 0; i--) {
            right[i] = r;
            r *= nums[i];
        }

        for (int i = 0; i < n; i++) {
            ans[i] = right[i] * left[i];
        }

        return ans;

    }
}