class Solution {
    public int pivotIndex(int[] nums) {

        // method 1
        // int j = 1;
        // int n = nums.length;
        // int leftSum = 0;
        // int rightSum = 0;
        // while (j < n - 1) {
        //     for (int i = 0; i < j; i++) {
        //         leftSum += nums[i];
        //     }
        //     for (int i = j + 1; i < n; i++) {
        //         rightSum += nums[i];
        //     }

        //     if (leftSum == rightSum)
        //         return j;
        // }
        // return -1;

        // method 2
        int n = nums.length;
        int leftSum[] = new int[n];
        int rightSum[] = new int[n];

        leftSum[0] = nums[0];
        for (int i = 1; i < n; i++) {
            leftSum[i] = nums[i] + leftSum[i - 1];
        }

        rightSum[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightSum[i] = nums[i] + rightSum[i + 1];
        }

        for (int i = 0; i < n; i++) {
            if (leftSum[i] == rightSum[i])
                return i;
        }

        return -1;
    }
}