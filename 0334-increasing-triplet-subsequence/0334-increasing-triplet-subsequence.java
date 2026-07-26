class Solution {
    public boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for(int j=0;j<nums.length;j++)
        {
            if(first>=nums[j])
            {
                first = nums[j];
            }
            else if( second>=nums[j] )
            {
                second = nums[j];
            }
            else return true;
        }
        return false;
    }
}