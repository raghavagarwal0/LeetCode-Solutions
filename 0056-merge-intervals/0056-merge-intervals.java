class Solution {
    public int[][] merge(int[][] arr) {
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        int start1 = arr[0][0];
        int end1 = arr[0][1];
      //  List<List<Integer>> ans = new ArrayList<>();  
        int [][] ans = new int[arr.length][2];
        int j=0;
        int start2 =0;
        int end2 =0;
        for(int i=1;i<arr.length;i++)
        {
            start2 = arr[i][0];
            end2 = arr[i][1];
            if(end1>=start2)
            {
                start1 = start1;
                end1 = Math.max(end1,end2);
            }
            else 
            {
                ans[j][0] = start1;
                ans[j][1] = end1;
                start1 = start2;
                end1 = end2;
                j++; 
            }
        }
        ans[j][0] = start1;
        ans[j][1] = end1;
        j++;
        return Arrays.copyOf(ans,j);
    }
}