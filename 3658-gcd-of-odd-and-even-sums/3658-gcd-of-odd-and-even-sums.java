class Solution {
    public int gcdOfOddEvenSums(int n) {
        int odd = 1;
        int even = 2;
        int oddsum =1;
        int evensum=2;
        for(int i=1;i<n;i++)
        {
            odd+=2;
            oddsum+=odd;
            even+=2;
            evensum+=even;
        }
        int k = Math.min(oddsum,evensum);
        for(int i=k;i>=1;i--)
        {
            if(oddsum%i==0 && evensum%i==0)
            {
                return i;
            }
        }
        return 0;
    }
}