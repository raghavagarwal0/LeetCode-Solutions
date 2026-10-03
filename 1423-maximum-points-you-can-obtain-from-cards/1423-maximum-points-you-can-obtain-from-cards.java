class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int result =0;
        int low=0;
        int high = cardPoints.length-1;
        int sum=0;
        for(low=0;low<k;low++)
        {
            sum = sum+cardPoints[low];
           
        }
         result = Math.max(result,sum);
         low = low-1;
        while(low>=0)
        {
            sum = sum-cardPoints[low];
            sum = sum + cardPoints[high];
            result = Math.max(result,sum);
            high--;
            low--;
        }
        return result;
    }
}