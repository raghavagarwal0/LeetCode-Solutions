class Solution {
    public int maxProduct(int n) {
        int max = 0;
        int min = 0;
        while(n>0)
        {
            int digit = n%10;
            n = n/10;
            if(max<=digit)
            {
                min  = max;
                max = digit;
                continue;
            }

            if(min<digit)
            {
                min = digit;
            }
        }
        return max*min;
    }
}