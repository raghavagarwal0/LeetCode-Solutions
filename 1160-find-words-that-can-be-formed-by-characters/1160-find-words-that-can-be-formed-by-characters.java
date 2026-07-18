class Solution {
    public int countCharacters(String[] words, String chars) {
        HashMap<Character,Integer> h = new HashMap<>();
        for(int i=0;i<chars.length();i++)
        {
            char ch = chars.charAt(i);
            h.put(ch,h.getOrDefault(ch,0)+1);
        }
        int ans =0;
        for(int i=0;i<words.length;i++)
        {
            HashMap<Character,Integer> h1 = new HashMap<>(h);
            String wordd = words[i];
            Boolean flag = true;
            for(int j=0;j<wordd.length();j++)
            {
                
                char ch = wordd.charAt(j);
                if(!h1.containsKey(ch) || h1.get(ch)==0)
                {
                    flag = false;
                    break;
                }
                h1.put(ch,h1.get(ch)-1);

            }
            if(flag)
            {
                ans +=wordd.length(); 
            }
        }
        return ans;
    }
}