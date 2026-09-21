class Solution {
    public String reversePrefix(String word, char ch) {
        Stack<Character> st = new Stack<>();
        Boolean flag = false;
        int i=0;
        while(i<word.length() )
        {
            st.push(word.charAt(i));
            if(word.charAt(i)==ch)
            {
                flag = true;
                break;
            }
            i++;
        }
        String ans = "";
        if(flag)
        {
            while(!st.isEmpty())
            {
                ans = ans+st.pop();
            }
            for(int j=i+1;j<word.length();j++)
            {
                ans = ans+word.charAt(j);
            }
            return ans;
        }

        return word;
    }
}