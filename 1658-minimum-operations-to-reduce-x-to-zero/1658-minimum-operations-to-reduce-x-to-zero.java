class Solution {
    public int minOperations(int[] nums, int x) {
        int sum=0;
        for(int num: nums)
        {
            sum+=num;
        }
        int target = sum-x;
        if(target==0) return nums.length;
        if(target<0) return -1;
        int summ = 0;
        int len =-1;
        int low=0;
        for(int high=0;high<nums.length;high++)
        {
            summ+=nums[high];
            while(summ>target && low<=high)
            {
                summ-=nums[low++];
            }
            if(summ==target) 
            {
                len = Math.max(len,high-low+1);
            }
        }
        if(len==-1) return -1;
        return nums.length-len;
}
}