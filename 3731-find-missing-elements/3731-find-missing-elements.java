class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        HashSet<Integer> h = new HashSet<>();
        int max = 0;
        int min = 101;
        for(int i=0;i<nums.length;i++)
        {
            h.add(nums[i]);
            max = Math.max(max,nums[i]);
            min = Math.min(min,nums[i]);
        }
        ArrayList<Integer> ans = new ArrayList<>();
       for(int i=min+1;i<max;i++)
        {
            if(!h.contains(i))
            {
                ans.add(i);
            }
        }     
        return ans;
    }
}