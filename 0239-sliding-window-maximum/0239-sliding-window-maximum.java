class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        int n = nums.length;
        int[] ans = new int[n - k + 1];

        Deque<Integer> dq = new ArrayDeque<>();

        int low = 0;
        int high = 0;
        int idx = 0;

        while (high < n) {

            while (!dq.isEmpty() && nums[dq.peekLast()] <= nums[high]) {
                dq.removeLast();
            }

            dq.addLast(high);

            if (dq.peekFirst() < low) {
                dq.removeFirst();
            }

            if (high - low + 1 == k) {
                ans[idx++] = nums[dq.peekFirst()];
                low++;
            }

            high++;
        }

        return ans;
    }
}