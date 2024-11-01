class Solution {
    public TreeNode replaceValueInTree(TreeNode root) {

        root.val = 0;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        // Perform BFS
        while (!q.isEmpty()) {
            int n = q.size(); 
            int sum = 0; 
            List<TreeNode> buf = new ArrayList<>();


            for (int i = 0; i < n; i++) {
                TreeNode node = q.poll();
                buf.add(node);

                if (node.left != null) {
                    q.add(node.left);
                    sum += node.left.val;
                }
                if (node.right != null) {
                    q.add(node.right);
                    sum += node.right.val;
                }
            }

            for (TreeNode node : buf) {
                int t = sum;
                if (node.left != null) t -= node.left.val;
                if (node.right != null) t -= node.right.val;
                if (node.left != null) node.left.val = t;
                if (node.right != null) node.right.val = t;
            }
        }
        return root;
    }
}