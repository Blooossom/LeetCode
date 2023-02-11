package BackTracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Test17_Letter_Combination_of_a_Phone_Number {
    class Solution {
        List<String> list = new ArrayList<>();
        HashMap<Character, String> map = new HashMap<>();
        public void init() {
            String[] phoneLetter = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
            char[] key = {'2', '3', '4', '5', '6', '7', '8', '9'};
            for (int i = 0; i < key.length; i++) {
                map.put(key[i], phoneLetter[i]);
            }
        }
        public List<String> letterCombinations(String digits) {
            init();
            if (digits.isEmpty()) {
                return list;
            }
            recursive(0, digits, "");
            return list;
        }
        public void recursive(int idx, String digits, String curr) {
            if (idx >= digits.length()) {
                list.add(curr);
                return;
            }
            String key = map.get(digits.charAt(idx));
            for (int i = 0; i < key.length(); i++) {
                String tmp = curr + String.valueOf(key.charAt(i));
                recursive(idx + 1, digits, tmp);
            }
        }
    }
}
