class Solution {
    public int findMaxLength(int[] nums) {
        int ans =0;
        int one =0;
        int zero =0;
        HashMap <Integer,Integer> h = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0) zero++;
            else one++;
            int diff = zero-one;
            if(diff==0) 
            {   
                ans = Math.max(ans,i+1);
                continue;
            }
            if(h.containsKey(diff))
            {
                ans = Math.max(ans,i-h.get(diff));
            } 
            else
            {
                h.put(diff,i);
            }
        }
        return ans;
    }
}