class Solution {

    static int noOfDig(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n /= 10;
        }

        return count;
    }

    public int findNumbers(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (noOfDig(nums[i]) % 2 == 0)
                count++;
        }

        return count;
    }
}