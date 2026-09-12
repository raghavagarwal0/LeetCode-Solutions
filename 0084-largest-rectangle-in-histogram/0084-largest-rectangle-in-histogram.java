class Solution {
    public int largestRectangleArea(int[] arr) {
        int n = arr.length;
        int [] prev = new int[n];
        int [] next =  new int [n];
        Stack <Integer> st = new Stack<>();
        for(int i=0;i<n;i++)
        {
            while(!st.isEmpty() && arr[st.peek()]>=arr[i])
            {
                st.pop();
            }
            if(!st.isEmpty())
            {
                prev[i] = st.peek();
            }
            else
            {
                prev[i] = -1;
            }
            st.push(i);
        }
        st.clear();
        for(int i=n-1;i>=0;i--)
        {
            while(!st.isEmpty() && arr[st.peek()]>=arr[i])
            {
                st.pop();
            }
            if(!st.isEmpty())
            {
                next[i] = st.peek();
            }
            else
            {
                next[i] = n;
            }
            st.push(i);
        }
        int ans =0;
        for(int i=0;i<n;i++)
        {
            int width = next[i]-prev[i]-1;
            int area = width*arr[i];
            ans = Math.max(ans,area);
        }
        return ans;
    }
}