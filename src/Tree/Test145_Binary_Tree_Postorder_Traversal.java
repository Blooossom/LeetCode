package Tree;

import java.util.ArrayList;
import java.util.List;

public class Test145_Binary_Tree_Postorder_Traversal {
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
        List<Integer> list = new ArrayList<>();
        public List<Integer> postorderTraversal(TreeNode root) {
            postorderTraverse(root);
            return list;
        }
        public void postorderTraverse(TreeNode self) {
            if (self == null) return;
            postorderTraversal(self.left);
            postorderTraverse(self.right);
            list.add(self.val);
        }
    }
}
