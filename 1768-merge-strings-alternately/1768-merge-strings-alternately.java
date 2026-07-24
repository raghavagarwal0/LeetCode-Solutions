class Solution {
    public String mergeAlternately(String word1, String word2) {
        String ans = "";
        int  n = word1.length();
        int  m = word2.length();
        int i=0;
        int j=0;
        Boolean flag = true; 
        while(i<n && j<m)
        {
            if(flag)
            {
                ans +=word1.charAt(i);
                i++;
            }
            else
            {
                ans+=word2.charAt(j);
                j++;
            }
            flag = !flag;
        }
        while(i<n)
        {
            ans+=word1.charAt(i);
            i++;
        }
        while(j<m)
        {
            ans +=word2.charAt(j);
            j++;
        }
        return ans;
    }
}