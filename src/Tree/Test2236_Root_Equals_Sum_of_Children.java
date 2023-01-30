package Tree;

public class Test2236_Root_Equals_Sum_of_Children {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode() {
        }

        public TreeNode(int val) {
            this.val = val;
        }

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    class Solution {
        public boolean checkTree(TreeNode root) {
            return root.val - root.left.val - root.right.val == 0;
        }
    }
}
