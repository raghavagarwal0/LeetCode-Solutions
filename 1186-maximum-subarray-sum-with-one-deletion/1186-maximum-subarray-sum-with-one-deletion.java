class Solution {
    public int maximumSum(int[] arr) {
        int oneDelete =  arr[0];
        int noDelete = arr[0];
        int result =arr[0];
        for(int i=1;i<arr.length;i++)
        {
            int prevone =  oneDelete;
            int prevno = noDelete;
            noDelete = Math.max(arr[i],prevno+arr[i]);
            int v2=0;
            if(prevone == Integer.MIN_VALUE)
            {
                v2 = arr[i];
            }
            else
            {
                v2 = prevone+arr[i];
            }
            oneDelete = Math.max(v2,prevno);
            result = Math.max(result,Math.max(oneDelete,noDelete));
        }
        return result;

    }
}