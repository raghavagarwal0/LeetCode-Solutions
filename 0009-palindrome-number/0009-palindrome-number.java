class Solution {
    public boolean isPalindrome(int x) {
        String str ="";
        while(x!=0)
        {
            int d = x%10;
            x = x/10;
            str = d+str; 
        }
        int low =0;
        int high = str.length()-1;
        while(low<=high)
        {
            if(str.charAt(low++)!=str.charAt(high--))
            {
                return false;
            }
        }
        return true;
    }
}