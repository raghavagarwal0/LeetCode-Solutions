class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        int n = nums.length;
        for(int i:nums)
        {
            sum+=i;
        } 
        int prefix=0;
        for(int i=0;i<n;i++)
        {
            
            int suffix = sum-prefix-nums[i];
            if(prefix==suffix)
            {
                return i;
            }
            prefix +=nums[i];
        }
        return -1;
    }
}