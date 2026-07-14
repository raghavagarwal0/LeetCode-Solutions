class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Arrays.sort(nums);
        ArrayList <Integer> ans = new ArrayList<>();
        int count=1;
        int candidate = nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(candidate !=nums[i])
            {
                if(count>nums.length/3) ans.add(candidate);
                candidate = nums[i];
                count=1;
            }
            else
            {
                count++;
            }
        }
        if(count > nums.length/3 ) ans.add(candidate);
        return ans;
    }
}