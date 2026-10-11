class Solution {
    public int sumOfSquares(int[] nums) {
     int ans = 0;
     int n = nums.length;
     for(int i=0;i<n;i++)
     {
        int j = i+1;
        if(n%j==0)
        {
            nums[i] = nums[i]*nums[i];
            ans +=nums[i];
        }
     }   
     return ans ;
    }
}