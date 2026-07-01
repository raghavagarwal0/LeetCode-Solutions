/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean findTarget(TreeNode root, int target) {
        ArrayList<Integer> arr  = new ArrayList<>();
        createArray(root,arr);
        int low = 0;
        int high = arr.size()-1;
        while(low<high)
        {
            int sum = arr.get(low) +arr.get(high);
            if(sum==target)
            {
                return true;
            }
            else if(sum>target)
            {
                high--;
            }
            else
            {
                low++;
            }
        }
        return false;

    }
    public void createArray(TreeNode root,ArrayList<Integer> arr)
    {
        if(root==null) return;
        createArray(root.left,arr);
        arr.add(root.val);
        createArray(root.right,arr);
        return;
    }
}