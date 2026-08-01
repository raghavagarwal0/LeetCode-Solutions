class Solution {
    public int maxVowels(String s, int k) {
        int low =0;
        int count =0;
        int ans=0;
        int high =k-1;
        for(int i =low;i<=high;i++)
        {
            char ch= s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            {
                count++;
            }
        }
       
        while(high<s.length())
        {
            ans = Math.max(ans,count);
             char ch= s.charAt(low);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            {
                count--;
            }
            low++;
            high++;
             if(high<s.length())
            {
                char ch1= s.charAt(high);
                if(ch1=='a' || ch1=='e' || ch1=='i' || ch1=='o' || ch1=='u')
                {
                    count++;
                }
            }
        
        }
        return Math.max(ans,count);
    }
}