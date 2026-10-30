class Solution {
    public String removeDuplicates(String s) {
        Stack <Character> st = new Stack<>();
        String ans ="";
        for(char ch : s.toCharArray())
        {
            if(!st.isEmpty() && ch ==st.peek())
            {
                st.pop();
            }
            else
            {
                st.push(ch);
            }
        }
        while(!st.isEmpty())
        {
            ans = st.pop()+ans;
        }
        return ans;
    }
}