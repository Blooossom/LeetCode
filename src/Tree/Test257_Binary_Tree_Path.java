package Tree;

import java.util.ArrayList;
import java.util.List;

public class Test257_Binary_Tree_Path {
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
    class Solution  {
        public List<String> binaryTreePaths (TreeNode root) {
            List<String> list = new ArrayList<>();
            String temp = "";
            if (root == null) {
                return list;
            }
            else {
                return recursive(root, list, temp);
            }
        }
        List<String> recursive(TreeNode root, List<String> list, String str) {
            if (root.left == null && root.right == null) {
                list.add(str + root.val);
            }
            if (root.left != null) {
                recursive(root.left, list, str + root.val + "->");
            }
            if (root.right != null) {
                recursive(root.right, list, str + root.val + "->");
            }
            return list;
        }
    }
}
