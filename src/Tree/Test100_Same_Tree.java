package Tree;

public class Test100_Same_Tree {
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
        public boolean isSameTree(TreeNode p, TreeNode q) {
            return recursive(p, q);
        }
        public boolean recursive(TreeNode p, TreeNode q) {
            if (p == null && q == null) {
                return true;
            }
            if (p == null || q == null) {
                return false;
            }
            if (p != null && q != null && p.val != q.val) {
                return false;
            }
            return recursive(p.left, q.left) && recursive(p.right, q.right);
        }
    }
}
