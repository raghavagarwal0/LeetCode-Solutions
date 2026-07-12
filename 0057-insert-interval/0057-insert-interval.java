class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int n = intervals.length;
        int [][] ans = new int[n+1][2];
        Boolean flag = true;
        int j=0;
        for(int i=0;i<n+1;i++)
        {
            if(flag==true && (j>=n  || newInterval[0]<=intervals[j][0]))
            {
                ans[i][0] = newInterval[0];
                ans[i][1] = newInterval[1];
                flag = false;
            }
            else
            {
                ans[i][0] = intervals[j][0];
                ans[i][1] = intervals[j][1];
                j++;
            }
        }
        int start1 = ans[0][0];
        int end1 = ans[0][1];
        int [][] ans1 = new int [n+1][2];
        int k=0;
        for(int i=1;i<n+1;i++)
        {
            int start2 = ans[i][0];
            int end2 = ans[i][1];
            if(end1>=start2)
            {
                end1 = Math.max(end1,end2);
            }
            else
            {
                ans1[k][0] = start1;
                ans1[k][1] = end1;
                start1 = start2;
                end1 = end2;
                k++;
            }
        }
        ans1[k][0] = start1;
        ans1[k][1] = end1;
        
        return Arrays.copyOf(ans1,k+1);
    }
}