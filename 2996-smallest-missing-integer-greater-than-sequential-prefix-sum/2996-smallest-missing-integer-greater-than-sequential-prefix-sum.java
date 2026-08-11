class Solution {
    public Boolean ans(int n , int [] nums)
    {
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==n)
            {
                return false;
            }
        }
        return true;
    }
    public int missingInteger(int[] nums) {
        int sum =nums[0];
        for(int i=1;i<nums.length;i++)
        {
           
            if(nums[i]!=nums[i-1]+1)
            {
                break;
            }
             sum +=nums[i];
        }
        while(!ans(sum,nums))
        {
            sum +=1;
        }
        return sum;
        
        
    }
}