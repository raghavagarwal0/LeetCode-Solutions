class Solution {
    public int compress(char[] chars) {
        String ans = "";
        int n = chars.length;
        if(n==1) return 1;
        int count =1;
        int place = 0;
        for(int i=1;i<n;i++)
        {
            if(chars[i]==chars[i-1])
            {
                count++;
            }
            else
            {
                chars[place] = chars[i-1];
                place++;
                if(count>1)
                {
                    for (char c : String.valueOf(count).toCharArray()) {
                     chars[place++] = c;
                    }
                } 
                count=1;
            }
        }
        if(n>1)
        {
            chars[place++] = chars[n-1];
        }
        
        if(count>1) 
        {
            for (char c : String.valueOf(count).toCharArray()) {
             chars[place++] = c;
            }
        }
        return place;
    }
}