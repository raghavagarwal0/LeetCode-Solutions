class Solution {
    static void swap(int [] nums,int i,int j)
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public void moveZeroes(int[] nums) {
        int low = 0;
        for(int high =0;high<nums.length;high++)
        {
            if(nums[high]!=0)
            {
                swap(nums,low,high);
                low++;
            }
        }
    }
}