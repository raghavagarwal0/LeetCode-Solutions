class Solution {
    public int maxArea(int[] height) {
        int ans =0;
        int low  =0;
        int high =height.length-1;
        while(low<high)
        {
            int area = Math.min(height[low], height[high])*(high-low);
            ans = Math.max(area,ans );
            if(height[low]<height[high])
            {
                low++;
            }
            else 
            {
                high--;
            }
        }
        return ans;

    }
}