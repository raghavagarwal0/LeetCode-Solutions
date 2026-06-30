class Solution {
    public int numberOfSubstrings(String s) {
        HashMap<Character,Integer> h = new HashMap<>();
        int count =0;
        int n = s.length();
        int low=0;
        for(int high = 0;high<n;high++)
        {
            char ch = s.charAt(high);
            h.put(ch,h.getOrDefault(ch,0)+1);

            while(h.size()>=3)
            {
                count =count+( (n-low)- (high-low));
                char ch1 = s.charAt(low);
                h.put(ch1,h.get(ch1)-1);
                if(h.get(ch1)==0)
                {
                    h.remove(ch1);
                }
                low++;
            }
        }
        return count;
    }
}