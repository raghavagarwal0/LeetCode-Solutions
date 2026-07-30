class Solution {
    public int minimumPushes(String word) {
        int n = word.length();
        if(n<=8) return n;
        int ans=1;
        for(int i=0;i<n;i++)
        {
            if(i<=8) ans+=1;
            else if(i<16) ans+=2;
            else if(i<24) ans+=3;
            else ans+=4;
        }
        return ans;
    }
}