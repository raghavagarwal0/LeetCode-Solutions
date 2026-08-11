class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        String prefix =strs[0];
        for(int i=1;i<strs.length;i++)
        {
            String s = strs[i];
            int n = Math.min(prefix.length(),s.length());
            String ans = ""; 
            for(int j=0;j<n;j++)
            {

                if(s.charAt(j)!=prefix.charAt(j))
                {
                    if(ans.length()<1)
                    {
                        return "";
                    }
                    break;
                }
                ans +=s.charAt(j);
            }
            prefix = ans;
        }
        return prefix;

    }
}