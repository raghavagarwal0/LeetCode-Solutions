class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int rows = 0;
        int n = mat.length;
        int m = mat[0].length;
        int ones =0;
        for(int i=0;i<n;i++)
        {
            int count =0;
           int  maxC =0; 
            for(int j=0;j<m;j++)
            {
                if(mat[i][j]==1)
                {
                    count++;
                }
                else 
                {
                    maxC = Math.max(maxC,count);
                }
                maxC = Math.max(maxC,count);

            }
                if(ones<maxC)
                {
                    rows = i;
                    ones = maxC;
                }
        }
        int []arr = new int[2];
        arr[0] = rows;
        arr[1] = ones;
        return arr;
    }
}