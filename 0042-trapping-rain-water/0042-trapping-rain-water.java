class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int [] prev = new int[n];
        int [] next = new int [n];
        prev[0] = height[0];
        next[n-1] = height[n-1];
        for(int i=1;i<n;i++)
        {
            int j = n-i-1;
            prev[i] = Math.max(prev[i-1],height[i]);
            next[j] = Math.max(next[j+1],height[j]);
        }
        int water=0;
        for(int i=0;i<n;i++)
        {
            water+=Math.min(prev[i],next[i])-height[i];
        }
        return water;
        
    }
}