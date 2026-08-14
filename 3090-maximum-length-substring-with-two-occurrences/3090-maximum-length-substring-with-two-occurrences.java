class Solution {
    public int maximumLengthSubstring(String s) {
        HashMap<Character,Integer> h = new HashMap<>();
        int low=0;
        int ans =0;
        int len = 0;
        for(int high=0;high<s.length();high++)
        {
            char ch = s.charAt(high);
            h.put(ch,h.getOrDefault(ch,0)+1);
            while(h.get(ch)>2)
            {
                char ch1 = s.charAt(low);
                h.put(ch1,h.get(ch1)-1);
                if(h.get(ch1)<=0)
                {
                    h.remove(ch1);
                }
                low++;
            }
            len = high-low+1;
            ans = Math.max(ans,len);
        }
        return ans;
    }
}