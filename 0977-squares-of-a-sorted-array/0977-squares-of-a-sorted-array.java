class Solution {
    public int[] sortedSquares(int[] nums) {
        int [] ans =  new int[nums.length];
        int n = nums.length;
        int high = n-1;
        int low=0;
        for(int i=n-1;i>=0;i--)
        {
            int p2 = nums[high]*nums[high];
            int p1 = nums[low]*nums[low];
            if(p2>p1)
            {
                ans[i] = p2;
                high--;
            }
            else
            {
                ans[i] = p1;
                low++;
            }
        }
        return ans;
    }
}