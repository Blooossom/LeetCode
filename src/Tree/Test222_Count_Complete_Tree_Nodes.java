package Tree;

public class Test222_Count_Complete_Tree_Nodes {
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
        public int countNodes(TreeNode root) {
            return root == null? 0:countNodes(root.left) + countNodes(root.right) + 1;
        }
    }
}


