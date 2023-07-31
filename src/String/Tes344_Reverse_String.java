package String;

import java.util.Stack;

public class Tes344_Reverse_String {
    class Solution {
        public void reverseString(char[] s) {
            Stack<Character> stack = new Stack<>();
            char[] result = new char[s.length];
            for (char param:s) {
                stack.push(param);
            }
            for (int i = 0; i < result.length; i++) {
                s[i] = stack.pop();
            }
        }

    }
}
