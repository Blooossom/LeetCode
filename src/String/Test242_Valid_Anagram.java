package String;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

public class Test242_Valid_Anagram {
    class Solution {
        public boolean isAnagram(String s, String t) {
            if (s.length() != t.length()) return false;
            String[] sArr = s.split("");
            String[] tArr = t.split("");
            Arrays.sort(sArr);
            Arrays.sort(tArr);
            for (int i = 0; i < sArr.length; i++) {
                if (!Objects.equals(sArr[i], tArr[i])) return false;
            }
            return true;
        }
    }
}
