class Solution {
    public boolean sumGame(String num) {
        int n = num.length();
        int sumLeft = 0, sumRight = 0;
        int qLeft = 0, qRight = 0;
        
        // Count sums and '?' for the left half
        for (int i = 0; i < n / 2; i++) {
            if (num.charAt(i) == '?') {
                qLeft++;
            } else {
                sumLeft += num.charAt(i) - '0';
            }
        }
        
        // Count sums and '?' for the right half
        for (int i = n / 2; i < n; i++) {
            if (num.charAt(i) == '?') {
                qRight++;
            } else {
                sumRight += num.charAt(i) - '0';
            }
        }
        
        // If the total number of '?' is odd, Alice will always have the last move and win.
        if ((qLeft + qRight) % 2 != 0) {
            return true;
        }
        
        // If the total '?' is even, Bob gets the last move.
        // Bob can only win if the difference in the current sums is perfectly balanced 
        // by the difference in question marks (each pair of '?' contributes exactly 9).
        int sumDiff = sumLeft - sumRight;
        int qDiff = qRight - qLeft;
        
        return sumDiff != (qDiff / 2) * 9;
    }
}