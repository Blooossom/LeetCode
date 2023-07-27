package Math;

public class Test9_Palindrome_Number {
    class Solution {
        public boolean isPalindrome(int x) {
            if (x < 0) {
                return false;
            }
            else if (x == 0) {
                return true;
            }
            else {
                String tmp = Integer.toString(x);
                int sp = 0;
                int ep = tmp.length() - 1;
                while (true) {
                    if (sp >= ep) {
                        break;
                    }
                    if (tmp.charAt(sp) != tmp.charAt(ep)) {
                        return false;
                    }
                    sp++;
                    ep--;
                }
                return true;
            }
        }
    }
}
