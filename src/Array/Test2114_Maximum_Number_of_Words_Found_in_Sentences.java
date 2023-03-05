package Array;

import java.util.StringTokenizer;

public class Test2114_Maximum_Number_of_Words_Found_in_Sentences {
    class Solution {
        public int mostWordsFound(String[] sentences){
            StringTokenizer st;
            int max = 0;
            for (int i = 0; i < sentences.length; i++) {
                st = new StringTokenizer(sentences[i], " ");
                max = Math.max(st.countTokens(), max);
            }
            return max;
        }
    }
}
