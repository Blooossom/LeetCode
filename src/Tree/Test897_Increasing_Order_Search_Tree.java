package Tree;

import java.util.*;

public class Test897_Increasing_Order_Search_Tree {
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
        List<TreeNode> list = new ArrayList<>();
        public TreeNode increasingBST(TreeNode root) {
            recursive(root);
            Collections.sort(list, new Comparator<TreeNode>() {
                @Override
                public int compare(TreeNode o1, TreeNode o2) {
                    if (o1.val > o2.val) {
                        return 1;
                    }
                    else if (o1.val == o2.val) {
                        return 0;
                    }
                    else {
                        return -1;
                    }
                }
            });
            TreeNode result = list.get(0);
            insert(result, 1);
            return result;
        }
        public void recursive(TreeNode root) {
            if (root == null) {
                return;
            }
            else {
                list.add(root);
            }
            recursive(root.right);
            recursive(root.left);
        }
        public void insert(TreeNode root, int idx) {
            if (idx >= list.size()) {
                return;
            }
            root.right = list.get(idx);
            insert(root.right, idx + 1);
        }
    }

    public static void main(String[] args) {
        System.out.println();
    }
}
