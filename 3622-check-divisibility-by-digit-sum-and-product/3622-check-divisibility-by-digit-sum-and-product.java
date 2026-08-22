class Solution {
    public boolean checkDivisibility(int n) {
        int digit =n;
        int sum=0;
        int product=1;
        while(digit>0)
        {
            int d = digit%10;
            digit = digit/10;
            sum+=d;
            product*=d;
        }
        return (n%(sum+product)==0);
    }
}