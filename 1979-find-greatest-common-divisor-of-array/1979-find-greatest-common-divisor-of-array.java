class Solution {
    public static int gcd(int a,int b)
    {
        if(b==0) return a;
        return gcd(b,a%b);
    }
    public int findGCD(int[] nums) {
        int maxi= nums[0];
        int mini = nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(maxi<nums[i]) maxi = nums[i];
            if(mini>nums[i]) mini = nums[i];
        }
        int ans = gcd(mini,maxi);
        return ans;
    }
}