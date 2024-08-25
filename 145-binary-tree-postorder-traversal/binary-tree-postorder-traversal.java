class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<Integer>();
        
        if(root == null) {
            return ans;
        }
        
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode curr = root, prev = null;
        
        while(curr != null || !stack.isEmpty()) {
            while(curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            
       
            
            if(stack.peek().right == null || stack.peek().right == prev) {

                prev = stack.pop();
                ans.add(prev.val);
            } else {

                curr = stack.peek().right;
            }
        }
        
        return ans;
    }
}