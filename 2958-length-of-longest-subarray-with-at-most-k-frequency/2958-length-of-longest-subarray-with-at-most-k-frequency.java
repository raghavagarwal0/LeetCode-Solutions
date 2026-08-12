class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int low =0;
        HashMap<Integer,Integer> h = new HashMap<>();
        int ans =0;
        int count =0;

        for(int high=0;high<nums.length;high++)
        {
            h.put(nums[high],h.getOrDefault(nums[high],0)+1);
            while(h.get(nums[high])>k)
            {
                h.put(nums[low],h.getOrDefault(nums[low],0)-1);
                if(h.get(nums[low])==0)
                {
                    h.remove(nums[low]);
                }
                low++;
            }
            count = high-low+1;
            ans = Math.max(ans,count);
        }
        return ans;
    }
}