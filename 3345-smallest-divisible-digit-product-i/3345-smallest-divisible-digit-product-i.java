class Solution {
    public int smallestNumber(int n, int t) {
        
        while(true)
        {
            if(n<10)
            {
                if(n%t==0) return n;

                n++;
                continue;
            }
            int d = n%10;
            int d1 = n/10;
            int product  =d*d1;
            if(product%t==0)
            {
                return n;
            }
            else
            {
                n++;
            }
        }
        
    }
}