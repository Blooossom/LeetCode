package Tree;

public class Test965_Univalued_Binary_Tree {
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
        public boolean isUnivalTree(TreeNode root) {
            return root == null || recursive(root, root.val);
        }
        public boolean recursive(TreeNode temp, int param) {
            if (temp == null) {
                return true;
            }
            if (temp.val != param) {
                return false;
            }
            return recursive(temp.left, param) && recursive(temp.right, param);
        }
    }
}
