class Solution {
    public int maxArea(int[] height) {
        int low =0;
        int high = height.length-1;
        int area = Integer.MIN_VALUE;

        while(low<high)
        {
            int minn = Math.min(height[high],height[low]);
            area= Math.max(area,minn*(high-low));
            if(height[low]<height[high])
            {
                low++;
            }
            else 
            {
                high--;
            }
        }
        return area;
    }
}