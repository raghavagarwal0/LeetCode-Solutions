class Solution {
    public int longestSubarray(int[] nums) {
        int low=0;
        int ans =0;
        int zero=0;

        for(int high=0;high<nums.length;high++)
        {
            if(nums[high]==0) zero++;
            
            while(zero>1)
            {
                if(nums[low]==0) zero--;
                low++;
            }
            if(zero<2)
            {
                ans = Math.max(ans,high-low);
            }

        }
        return ans;
    }
}