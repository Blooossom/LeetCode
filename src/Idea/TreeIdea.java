package Idea;

import java.util.ArrayList;
import java.util.List;
/*
inorder = left self right
preorder = self left right
postorder = left right self
 */
public class TreeIdea {
    List<Integer> list;
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode t1 = new TreeNode(2);
        TreeNode t2 = new TreeNode(3);
        root.right = t1;
        t1.left = t2;
        TreeIdea treeIdea = new TreeIdea();
        for (Integer i: treeIdea.inorder(root)) {
            System.out.println(i + " ");
        }
        System.out.println();
        for (Integer i: treeIdea.preorder(root)) {
            System.out.println(i + " ");
        }
        System.out.println();
        for (Integer i: treeIdea.postorder(root)) {
            System.out.println(i + " ");
        }
    }
    public List<Integer> inorder(TreeNode root) {
        list = new ArrayList<>();
        inorderTraverse(root);
        return list;
    }
    public void inorderTraverse(TreeNode self) {
        if (self == null) {
            return;
        }
        inorderTraverse(self.left);
        list.add(self.val);
        inorderTraverse(self.right);
    }
    public List<Integer> preorder(TreeNode root) {
        list = new ArrayList<>();
        preorderTraverse(root);
        return list;
    }
    public void preorderTraverse(TreeNode self) {
        if (self == null) {
            return;
        }
        list.add(self.val);
        preorderTraverse(self.left);
        preorderTraverse(self.right);
    }
    public List<Integer> postorder(TreeNode root) {
        list = new ArrayList<>();
        postorderTraverse(root);
        return list;
    }
    public void postorderTraverse(TreeNode self) {
        if (self == null) {
            return;
        }
        postorderTraverse(self.left);
        postorderTraverse(self.right);
        list.add(self.val);
    }
    static class TreeNode {
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
}
