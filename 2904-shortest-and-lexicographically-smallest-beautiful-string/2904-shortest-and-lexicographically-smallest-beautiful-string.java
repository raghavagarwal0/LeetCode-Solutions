class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        String best = "";
        int n = s.length();
        
        for (int i = 0; i < n; i++) {
            int count1 = 0;
            for (int j = i; j < n; j++) {
                if (s.charAt(j) == '1') {
                    count1++;
                }
                
                // When we hit exactly k ones, evaluate the current substring
                if (count1 == k) {
                    String sub = s.substring(i, j + 1);
                    
                    // Update 'best' if it's the first one found, shorter, 
                    // or same length but lexicographically smaller
                    if (best.isEmpty() || sub.length() < best.length() || 
                       (sub.length() == best.length() && sub.compareTo(best) < 0)) {
                        best = sub;
                    }
                } else if (count1 > k) {
                    // Stop extending this substring if we exceed k ones
                    break; 
                }
            }
        }
        
        return best;
    }
}