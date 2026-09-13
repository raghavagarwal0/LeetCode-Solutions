class Solution {
    public int largestOverlap(int[][] img1, int[][] img2) {
        int n = img1.length;
        int count = 0;

        // Har possible horizontal (shiftJ) aur vertical (shiftI) shift test karni padegi
        for (int shiftI = -n + 1; shiftI < n; shiftI++) {
            for (int shiftJ = -n + 1; shiftJ < n; shiftJ++) {
                int temp = 0; // Current shift ka match count

                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        int r = i + shiftI;
                        int c = j + shiftJ;

                        if (r >= 0 && r < n && c >= 0 && c < n) {
                            if (img1[i][j] == 1 && img2[r][c] == 1) {
                                temp++;
                            }
                        }
                    }
                }

                if (temp > count) {
                    count = temp;
                }
            }
        }

        return count;
    }
}