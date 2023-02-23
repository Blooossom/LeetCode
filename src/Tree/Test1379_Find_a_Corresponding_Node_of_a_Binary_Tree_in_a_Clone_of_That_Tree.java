package Tree;

public class Test1379_Find_a_Corresponding_Node_of_a_Binary_Tree_in_a_Clone_of_That_Tree {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }
    class Solution {
        TreeNode result;
        public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
            recursive(original, cloned, target);
            return result;
        }
        public void recursive(TreeNode original, TreeNode cloned, TreeNode target) {
            if (original == null) {
                return;
            }
            recursive(original.left, cloned.left, target);
            if (original == target) {
                result = cloned;
                return;
            }
            recursive(original.right, cloned.right, target);
        }
    }
}
