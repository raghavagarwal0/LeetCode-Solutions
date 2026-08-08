class Solution {
    public int[] validSequence(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();

        // suf[i] = first unmatched position in word2
        // when matching word2 from the back using word1[i...]
        int[] suf = new int[n + 1];
        Arrays.fill(suf, m);

        int j = m - 1;

        for (int i = n - 1; i >= 0; i--) {
            if (j >= 0 && word1.charAt(i) == word2.charAt(j)) {
                j--;
            }
            suf[i] = j + 1;
        }

        int[] ans = new int[m];
        int size = 0;

        boolean used = false;
        int i = 0;

        for (int k = 0; k < m; k++) {
            while (i < n) {

                // Exact match
                if (word1.charAt(i) == word2.charAt(k)) {
                    ans[size++] = i;
                    i++;
                    break;
                }

                // Use the one allowed modification
                if (!used && suf[i + 1] <= k + 1) {
                    used = true;
                    ans[size++] = i;
                    i++;
                    break;
                }

                i++;
            }

            // Not enough characters in word1
            if (size != k + 1) {
                return new int[0];
            }
        }

        return ans;
    }
}