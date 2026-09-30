class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int depth = 0;
        int [] ans = new int[seq.length()];
        for(int i=0;i<seq.length();i++)
        {
            char ch = seq.charAt(i);
            if(ch=='(')
            {
                
                ans[i] = depth%2;
                depth++;
            }
            else
            {
                depth--;
                ans[i] = depth%2;
            }
        }
        return ans;
    }
}