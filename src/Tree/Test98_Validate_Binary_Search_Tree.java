package Tree;

public class Test98_Validate_Binary_Search_Tree {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

        public TreeNode(int val) {
            this.val = val;
        }

        public TreeNode() {
        }
    }
    class Solution {
        public boolean isValidBST(TreeNode root) {
            Long temp1 = Long.MIN_VALUE;
            Long temp2 = Long.MAX_VALUE;
            return valid(root, temp1, temp2);
        }
        public boolean valid(TreeNode root, long p, long q) {
            if (root == null) return true;
            return (root.val > p && root.val < q)
                    && valid(root.left, p, root.val)
                    && valid(root.right, root.val, q);

        }
    }
}
