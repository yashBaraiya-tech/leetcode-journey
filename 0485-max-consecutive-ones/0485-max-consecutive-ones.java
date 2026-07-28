class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int i = 0, count = 0, max = 0;
        while (i < nums.length) {
            if (nums[i] == 1) {
                count++;
                i++;
            } else {
                if (count > max)
                    max = count;
                i++;
                count = 0;
            }
        }
        if (count > max)
            max = count;

        return max;
    }
}