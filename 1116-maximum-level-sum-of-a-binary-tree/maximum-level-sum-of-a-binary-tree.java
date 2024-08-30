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
    
    public int maxLevelSum(TreeNode root) {
        Map<Integer, Integer> levelOrderMap = new HashMap<>();
        inorderTraversal(root, levelOrderMap, 1);
        return Collections.max(levelOrderMap.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
    
    public void inorderTraversal(TreeNode node, Map<Integer, Integer> map, int depth) {
        if(node != null) {
            inorderTraversal(node.left, map, depth+1);
            map.put(depth, map.getOrDefault(depth, 0) + node.val);
            inorderTraversal(node.right, map, depth+1);
        }
    }
}