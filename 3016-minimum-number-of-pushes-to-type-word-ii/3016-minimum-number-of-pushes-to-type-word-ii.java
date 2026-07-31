class Solution {
    public int minimumPushes(String word) {
        int [] freq = new int[26];
        for(int i=0;i<word.length();i++)
        {
            char ch = word.charAt(i);
            freq[ch-'a']++;
        }
        Arrays.sort(freq);
        int ans =0;
        int [] arr = new int[freq.length];
        int j=0;
        for(int i=freq.length-1;i>=0;i--)
        {
            if(freq[i]==0) continue;
            arr[j++] = freq[i];
        }
        for(int i=0;i<arr.length;i++)
        {
            if(i<8) ans+=arr[i]*1;
            else if(i<16) ans+=arr[i]*2;
            else if(i<24) ans+=arr[i]*3;
            else ans+=arr[i]*4;
        }
        return ans;
    }
}