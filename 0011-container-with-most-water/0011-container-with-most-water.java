class Solution {
    public int maxArea(int[] height) {
        int area=0;
        int ans =0;
        int low=0;
        int high = height.length-1;
        while(low<high)
        {
            int width  =Math.min(height[low],height[high]);
            area = width*(high-low);
            if(height[low]<height[high]) low++;
            else high--;
            ans = Math.max(ans,area);
        }
        return ans;

    }
}