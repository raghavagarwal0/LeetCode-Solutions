class Solution {
    public String countAndSay(int n) {
        String s ="1";
        for(int i=1;i<n;i++)
        {
            StringBuilder sb = new StringBuilder();
            int j=0;
            while(j<s.length())
            {
                int count=0;
                char ch = s.charAt(j);
                while(j<s.length() && ch==s.charAt(j))
                {
                    count++;
                    j++;
                }
                sb.append(count);
                sb.append(ch);
            }
            s = sb.toString();
        }
        return s;
        
    }
}