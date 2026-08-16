class Solution {
    public void gameOfLife(int[][] board) {
        if (board == null || board.length == 0) return;
        
        int m = board.length;
        int n = board[0].length;
        
        // Directions for all 8 neighbors (top, bottom, left, right, 4 diagonals)
        int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};
        
        // Step 1: Calculate the next state and encode it into the 2nd bit
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int liveNeighbors = 0;
                
                // Count live neighbors
                for (int k = 0; k < 8; k++) {
                    int r = i + dx[k];
                    int c = j + dy[k];
                    
                    // Check boundaries. We do `board[r][c] & 1` to read only the *current* state.
                    if (r >= 0 && r < m && c >= 0 && c < n && (board[r][c] & 1) == 1) {
                        liveNeighbors++;
                    }
                }
                
                // Apply rules
                if ((board[i][j] & 1) == 1) {
                    // Rule 2: Any live cell with 2 or 3 live neighbors lives on.
                    if (liveNeighbors == 2 || liveNeighbors == 3) {
                        board[i][j] |= 2; // Set the 2nd bit to 1 (becomes 11 in binary, which is 3)
                    }
                    // Rule 1 & 3: Less than 2 or more than 3 dies. We do nothing so 2nd bit stays 0.
                } else {
                    // Rule 4: Any dead cell with exactly 3 live neighbors becomes a live cell.
                    if (liveNeighbors == 3) {
                        board[i][j] |= 2; // Set the 2nd bit to 1 (becomes 10 in binary, which is 2)
                    }
                }
            }
        }
        
        // Step 2: Shift the bits to the right to update the board to the next state
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] >>= 1; 
            }
        }
    }
}