class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int [] next = new int[n];
        int [] prev = new int [n];
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++)
        {
            while(!st.isEmpty() && heights[st.peek()]>=heights[i])
            {
                st.pop();
            }
            if(!st.isEmpty())
            {
                prev[i] = st.peek();
            }
            else prev[i] = -1;
            st.push(i);
        }
        st.clear();
        for(int i=n-1;i>=0;i--)
        {
            while(!st.isEmpty() && heights[i]<=heights[st.peek()] )
            {
                st.pop();
            }
            if(st.isEmpty())
            {
                next[i] = n;
            }
            else next[i] = st.peek();
            st.push(i);
        }
        int ans =0;
        for(int i=0;i<n;i++)
        {
            int width = next[i]-prev[i]-1;
            int area = width*heights[i];
            ans = Math.max(area,ans);
        }
        return ans;
    }
}