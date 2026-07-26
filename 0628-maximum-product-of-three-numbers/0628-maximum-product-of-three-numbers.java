class Solution {
    public int maximumProduct(int[] nums) {
        int  min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        int min3 = Integer.MAX_VALUE;
        int max1 = Integer.MIN_VALUE;  
         int max2 = Integer.MIN_VALUE;
          int max3 = Integer.MIN_VALUE;
          for(int i=0;i<nums.length;i++)
          {
            if(max1<nums[i]) 
            {
                max3 = max2;
                max2 = max1;
                max1 = nums[i];
            }
            else if(max2<nums[i])
            {
                max3 = max2;
                max2 = nums[i];
            }
            else if(max3<nums[i]) max3 = nums[i];

            else max2 = max2;

             if(min1>nums[i])
            {
                min3 = min2;
                min2 = min1;
                min1 = nums[i];
            }
            else if(min2>nums[i])
            {
                min3 = min2;
                min2 = nums[i];
            }
            else if(min3>nums[i])
            {
                min3 = nums[i];
            }
            else continue;
          }
          int minp =min1*min2*max1;
            int maxp =max1*max2*max3;

          return Math.max(minp,maxp);
    }
}