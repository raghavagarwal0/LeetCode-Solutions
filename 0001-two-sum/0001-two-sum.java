class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> h = new HashMap<>();
        int [] arr = new int[2];
        for(int i=0;i<nums.length;i++)
        {
            int n = target-nums[i];
            if(!h.isEmpty() && h.containsKey(n))
            {
                arr[0] = h.get(n);
                arr[1] = i;
                return arr;
            }
            h.put(nums[i],i);
        }
        return arr;
    }
}