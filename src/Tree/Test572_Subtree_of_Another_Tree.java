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
            if (root == null) {
                return false;
            }
            return recursive(root, subRoot)
                    || isSubtree(root.left, subRoot)
                    || isSubtree(root.right, subRoot);
        }

        public boolean recursive(TreeNode root, TreeNode subRoot) {
            if (root == null && subRoot == null) {
                return true;
            }
            if (root == null || subRoot == null) {
                return false;
            }
            if (root.val != subRoot.val) {
                return false;
            }
            return recursive(root.left, subRoot.left)
                    && recursive(root.right, subRoot.right);
        }
    }
}
