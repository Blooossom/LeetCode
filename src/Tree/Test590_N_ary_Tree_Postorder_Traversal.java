package Tree;

import java.util.ArrayList;
import java.util.List;

public class Test590_N_ary_Tree_Postorder_Traversal {
    class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, List<Node> children) {
            this.val = val;
            this.children = children;
        }
    }
    class Solution {
        List<Integer> list = new ArrayList<>();
        public List<Integer> postorder(Node root) {
            for (Node temp:root.children) {
                postorder(temp);
            }
            list.add(root.val);
            return list;
        }
    }
}
