package Tree;

public class Test572_Subtree_of_Another_Tree {
    class TreeNode {
        int val;
        TreeNode right;
        TreeNode left;

        public TreeNode() {
        }

        public TreeNode(int val) {
            this.val = val;
        }

        public TreeNode(int val, TreeNode right, TreeNode left) {
            this.val = val;
            this.right = right;
            this.left = left;
        }
    }
    class Solution {
        public boolean isSubtree(TreeNode root, TreeNode subRoot) {
            if (root == null || subRoot == null) {
                return root == null && subRoot == null;
            }
            else if (recursive(root, subRoot)) {
                return true;
            }
            else {
                return recursive(root.left, subRoot) || recursive(root.right, subRoot);
            }
        }
    }
    public boolean recursive(TreeNode root, TreeNode subRoot) {
        if (root == null || subRoot == null) {
            return root == null && subRoot == null;
        }
        else if (root.val == subRoot.val) {
            return recursive(root.left, subRoot.left) && recursive(root.right, subRoot.right);
        }
        else {
            return false;
        }
    }
}
