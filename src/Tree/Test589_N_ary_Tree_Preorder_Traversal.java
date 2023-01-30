package Tree;

import java.util.ArrayList;
import java.util.List;

public class Test589_N_ary_Tree_Preorder_Traversal {
    class Node{
        int val;
        List<Node> children;

        public Node() {
        }

        public Node(int val, List<Node> children) {
            this.val = val;
            this.children = children;
        }

        public Node(int val) {
            this.val = val;
        }
    }
    class Solution {
        List<Integer> list = new ArrayList<>();
        public List<Integer> preorder(Node root){
            if (root == null) {
                return list;
            }
            if(list.isEmpty()) {
                list.add(root.val);
            }
            for (Node temp:root.children) {
                list.add(temp.val);
                preorder(temp);
            }
            return list;
        }
    }
}
