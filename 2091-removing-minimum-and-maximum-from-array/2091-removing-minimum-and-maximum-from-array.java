class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        if (n <= 2) return n;

        int minIndex = 0;
        int maxIndex = 0;

        // Find the indices of the minimum and maximum elements
        for (int i = 1; i < n; i++) {
            if (nums[i] < nums[minIndex]) {
                minIndex = i;
            }
            if (nums[i] > nums[maxIndex]) {
                maxIndex = i;
            }
        }

        // Identify which index comes first and which comes last
        int i = Math.min(minIndex, maxIndex);
        int j = Math.max(minIndex, maxIndex);

        // Scenario 1: Remove both from the front
        int bothFromFront = j + 1;

        // Scenario 2: Remove both from the back
        int bothFromBack = n - i;

        // Scenario 3: Remove the earlier one from the front, and the later one from the back
        int frontAndBack = (i + 1) + (n - j);

        // Return the minimum of the three scenarios
        return Math.min(Math.min(bothFromFront, bothFromBack), frontAndBack);
    }
}