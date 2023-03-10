package String;

import java.util.StringTokenizer;

public class Test58_Length_of_Last_Word {
    class Solution {
        public int lengthOfLastWord(String s) {
            StringTokenizer st = new StringTokenizer(s, " ");
            String[] arr = new String[st.countTokens()];
            for (int i = 0; i < arr.length; i++) {
               arr[i] = st.nextToken();
            }
            return arr[arr.length - 1].length();
        }
    }
}
