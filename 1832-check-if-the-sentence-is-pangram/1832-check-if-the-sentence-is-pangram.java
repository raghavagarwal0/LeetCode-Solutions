class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean [] ab = new boolean[26];
        for(int i=0;i<sentence.length();i++)
        {
            int k = sentence.charAt(i)-'a';
            ab[k] = true;
        } 
        for(int i=0;i<ab.length;i++)
        {
            if(ab[i]==false)
            {
                return false;
            }
        }
        return true;
    }
}