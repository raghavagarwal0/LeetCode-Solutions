class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) return "";
        
        int start = 0;
        int end = 0;
        
        for (int i = 0; i < s.length(); i++) {
            int len1 = palindrome(s, i, i);     // Odd length palindrome (e.g., "aba")
            int len2 = palindrome(s, i, i + 1); // Even length palindrome (e.g., "abba")
            int len = Math.max(len1, len2);
            
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        
        return s.substring(start, end + 1);
    }
    
    // Helper method class ke andar par longestPalindrome ke bahar
    private int palindrome(String s, int low, int high) {
        int l = low;
        int h = high;
        
        while (l >= 0 && h < s.length() && s.charAt(l) == s.charAt(h)) {
            l--;
            h++;
        }
        
        return h - l - 1; // Valid palindrome length
    }
}