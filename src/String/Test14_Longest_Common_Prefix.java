package String;

public class Test14_Longest_Common_Prefix {
    public static void main(String[] args) {
        String[] arr = {"dog","racecar","car"};
        System.out.println(Solution.longestCommonPrefix(arr));
    }
    static class Solution {
        public static String longestCommonPrefix(String[] strs){
            if (strs.length == 0) {
                return "";
            }
            String base = strs[0];
            int min = 201;
            int idx = 0;
            for (int i = 0; i < strs.length; i++) {
                min = Math.min(min, strs[i].length());
            }
            label2:
            for (int i = 0; i < min; i++) {
                for (int j = 0; j < strs.length; j++) {
                    if (strs[j].charAt(i) != base.charAt(i)) {
                        break label2;
                    }
                }
                idx++;
            }

            return idx == 0? "":base.substring(0, idx);
        }
    }
}
