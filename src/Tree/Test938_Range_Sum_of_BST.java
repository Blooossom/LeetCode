package Tree;

public class Test938_Range_Sum_of_BST {
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
        private int answer = 0;
        public int rangeSumBST(TreeNode root, int low, int high) {
            recursive(root, low, high);
            return answer;
        }
        public void recursive(TreeNode root, int low, int high){
            if (root == null) {
                return;
            }
            if (root.val <= high && root.val >= low) {
                answer += root.val;
            }
            if (root.left != null) {
                recursive(root.left, low, high);
            }
            if (root.right != null) {
                recursive(root.right, low, high);
            }
        }
    }
}
