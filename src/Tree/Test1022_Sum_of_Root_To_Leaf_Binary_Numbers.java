package Tree;

import java.util.ArrayList;
import java.util.List;

public class Test1022_Sum_of_Root_To_Leaf_Binary_Numbers {
    List<String> list = new ArrayList<>();
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
        public int sumRootToLeaf(TreeNode root) {
            String str = Integer.toString(root.val);
            recursive(root, str);
            int sum = 0;
            for (int i = 0; i < list.size(); i++) {
                sum += Integer.parseInt(list.get(i));
            }
            return sum;
        }
        public void recursive(TreeNode root, String str) {
            if (root == null) {
                list.add(str);
            }
            else {
                str = str + Integer.toString(root.val);
            }
            recursive(root.right, str);
            recursive(root.left, str);
        }
    }
}
