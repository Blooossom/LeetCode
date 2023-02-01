package Tree;

public class Test124_Binary_Tree_Maximum_Path_Sum {
    class TreeNode {
        int val;
        TreeNode right;
        TreeNode left;

        public TreeNode(int val, TreeNode right, TreeNode left) {
            this.val = val;
            this.right = right;
            this.left = left;
        }

        public TreeNode() {
        }

        public TreeNode(int val) {
            this.val = val;
        }
    }
    class Solution {
        static int max;
        public int maxPathSum(TreeNode root) {
            max = Integer.MIN_VALUE;
            recursive(root);
            return max;
        }
        public static int recursive(TreeNode root) {
            if (root == null) return 0;
            int left = Math.max(0, recursive(root.left));
            int right = Math.max(0, recursive(root.right));
            max = Math.max(max, left + right + root.val);
            return Math.max(left, right) + root.val;
        }
    }
}
