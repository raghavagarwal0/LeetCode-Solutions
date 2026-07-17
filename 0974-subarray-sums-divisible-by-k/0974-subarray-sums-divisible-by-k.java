class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int sum=0;
        int ans =0;

        HashMap<Integer,Integer> h = new HashMap<>();
        h.put(0,1);
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            int rem= sum%k;
            if(rem<0)
            {
                rem+=k;
            }
            if(h.containsKey(rem))
            {
                ans +=h.get(rem);
            }
            h.put(rem,h.getOrDefault(rem,0)+1);
        }
        return ans;
    }
}