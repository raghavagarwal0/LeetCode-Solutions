import java.util.HashSet;
import java.util.Set;

class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> numSet = new HashSet<>();
        
        // Add all elements from the array into a HashSet for O(1) lookups
        for (int num : nums) {
            numSet.add(num);
        }
        
        // Start checking multiples of k (k, 2k, 3k, ...)
        int multiple = k;
        while (numSet.contains(multiple)) {
            multiple += k;
        }
        
        // Return the first multiple that is not present in the HashSet
        return multiple;
    }
}