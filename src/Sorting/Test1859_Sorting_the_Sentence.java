package Sorting;

import java.util.*;

public class Test1859_Sorting_the_Sentence {
    public static void main(String[] args) {
        String str = "is2 sentence4 This1 a3";
        Solution.sortSentence(str);
    }
    static class Solution {
        public static String sortSentence(String s) {
            StringTokenizer st = new StringTokenizer(s);
            int count = st.countTokens();
            List<String> list = new ArrayList<>();
            for (int i = 0; i < count; i++) {
                list.add(st.nextToken());
            }
            list.sort(Comparator.comparingInt(o -> Character.getNumericValue(o.charAt(o.length() - 1))));
            StringBuilder sb = new StringBuilder();
            System.out.println(list);
            for (String param : list) {
                String temp = param.substring(0, param.length() - 1);
                sb.append(temp).append(' ');
            }
            return sb.toString().trim();
        }
    }
}
