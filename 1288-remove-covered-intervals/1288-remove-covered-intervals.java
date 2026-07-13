class Solution {
    public int removeCoveredIntervals(int[][] arr) {
                Arrays.sort(arr, (a, b) -> {
            if (a[0] == b[0]) {
                return Integer.compare(b[1], a[1]);
            }
            return Integer.compare(a[0], b[0]);
        });
        int end1 = arr[0][1];
        int count=0;
        for(int i=1;i<arr.length;i++)
        {
            int end2 = arr[i][1];
            if(end1>=end2)
            {
                count++;
            }
            else 
            {
                end1 = end2;
            }
        } 
        return arr.length-count;
    }
}