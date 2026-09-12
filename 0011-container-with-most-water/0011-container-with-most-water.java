class Solution {
    public int maxArea(int[] height) {

     int low =0;
     int high = height.length-1;
     int area = -18737154;
     while(low<=high)
     {
        int min = Math.min(height[low],height[high]);
        area = Math.max(area,min*(high-low));
        if(height[low]>height[high])
        {
            high--;
        }
        else
        {
            low++;
        }
     } 
     return area;
    }
}