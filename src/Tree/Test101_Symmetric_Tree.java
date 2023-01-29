package Tree;

public class Test101_Symmetric_Tree {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(){}

        public TreeNode(int val) {
            this.val = val;
        }

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public boolean preOrder(TreeNode temp, TreeNode temp1) {
        if (temp == null || temp1 == null) {
            return  temp == temp1;
        }
        if (temp.val != temp1.val) {
            return false;
        }
        return preOrder(temp.left, temp1.right) && preOrder(temp.right, temp1.left);
    }
    public boolean isSymmetric(TreeNode root) {
        return root == null || preOrder(root.left, root.right);
    }

}
