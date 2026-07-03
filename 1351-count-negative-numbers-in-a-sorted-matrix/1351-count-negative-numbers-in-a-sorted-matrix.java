class Solution {
    public int countNegatives(int[][] grid) {
        int n = grid.length;
        int m= grid[0].length;
        int count =0;
        for(int i=0;i<n;i++)
        {
            for(int j=m-1;j>=0;j--)
            {
                if(grid[i][j]>=0) break;
                count++;
            }
        }
        return count;
    }
}