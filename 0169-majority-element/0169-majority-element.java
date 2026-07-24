class Solution {
    public int majorityElement(int[] nums) {

        // method 1
        // Arrays.sort(nums);
        // int count = 0;
        // int maxCount = 0;
        // int max = nums[0];
        // int i = 0;
        // int j = 0;

        // while (j < nums.length) {
        //     if (nums[i] == nums[j]) {
        //         count++;
        //         j++;
        //     } else {
        //         if (count > maxCount) {
        //             maxCount = count;
        //             max = nums[i];
        //         }
        //         i = j;
        //         count = 1;
        //         j++;
        //     }
            
        // }

        // if (count > maxCount) {
        //     max = nums[i];
        // }

        // return max;



        // method 2
        int freq=0, ans=nums[0];
        for(int i=0;i<nums.length;i++){
            if(freq==0){
                ans=nums[i];
            }
            if(nums[i]==ans){
                freq++;
            } else{
                freq--;
            }
        }
        return ans;
    }
}