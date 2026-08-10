class Solution {
    public int lengthOfLastWord(String s) {
        int count =0;
        int n=s.length();
        Boolean flag = true;
        for(int i=n-1;i>=0;i--)
        {
            char ch = s.charAt(i);
            if(ch!=' ')
            {
                if(flag) flag =false;
                count++;
            }
            else if(ch==' ' && flag==false)
            {
                break;
            }
        }
        return count;
    }
}