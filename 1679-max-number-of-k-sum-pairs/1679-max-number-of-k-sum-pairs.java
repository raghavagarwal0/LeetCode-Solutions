class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int low = 0;
        int high = nums.length-1;
        int ans = 0;
        while(low<high)
        {
            int sum = nums[low] + nums[high];
            if(sum==k)
            {
                ans++;
                low++;
                high--;
            }
            else if(sum>k) high--;
            else low++;
        }
        return ans;
    }
}