class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int low=0;
        double ans=0;
        int high=k-1;
        int sum=0;
        for(low=0;low<=high;low++)
        {
            sum+=nums[low];
        }
        int maxSum=sum;
        low=0;

        while(high<nums.length)
        {
                maxSum = Math.max(sum,maxSum);
                sum-=nums[low];
                low++;
                high++;
                if(high==nums.length) break;
                sum+=nums[high];
        }
                ans = Math.max(sum,maxSum);
        return (double) maxSum/k;
    }
}