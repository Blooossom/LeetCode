package Tree;

import java.util.ArrayList;
import java.util.List;

public class Test144_Binary_Tree_Preorder_Traversal {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode() {
        }

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

        public TreeNode(int val) {
            this.val = val;
        }
    }
    class Solution {
        List<Integer> list = new ArrayList<>();
        public List<Integer> preorderTraversal(TreeNode root) {
            preorderTraverse(root);
            return list;
        }
        public void preorderTraverse(TreeNode self) {
            if (self == null) {
                return;
            }
            preorderTraverse(self.left);
            list.add(self.val);
            preorderTraverse(self.right);
        }
    }
}
