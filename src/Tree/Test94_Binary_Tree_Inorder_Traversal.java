package Tree;

import java.util.ArrayList;
import java.util.List;

public class Test94_Binary_Tree_Inorder_Traversal {

    class Solution {
        private List<Integer> list = new ArrayList<>();
        public List<Integer> inorderTraversal(TreeNode root) {
            inorderTraverse(root);
            return list;
        }
        public void inorderTraverse(TreeNode self) {
            if (self == null) return;
            inorderTraverse(self.left);
            list.add(self.val);
            inorderTraverse(self.right);
        }
    }
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
}
