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
        int count = 0; // global variable to count

    public int goodNodes(TreeNode root) {
        helper(root, root.val);
        return count; 
    }

    private void helper(TreeNode root, int max) {
        if (root != null) {
            if (root.val >= max) { 
                count++; 
            }
            helper(root.left, Math.max(root.val, max));  
            helper(root.right, Math.max(root.val, max));  
        }
    }
}

    