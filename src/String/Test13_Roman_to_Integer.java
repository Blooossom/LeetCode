package String;

import java.util.HashMap;

public class Test13_Roman_to_Integer {
    public static void main(String[] args) {
        String input = "MCDLXXVI";
        System.out.println(Solution.romanToInt(input));
    }
    static class Solution {
        private static HashMap<Character, Integer> roman = new HashMap<>();
        public static int romanToInt(String s) {
            init();
            int sum = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'I' && i < s.length() - 1
                && (s.charAt(i + 1) == 'V' || s.charAt(i + 1) == 'X')) {
                    if (s.charAt(i + 1) == 'V') {
                        sum += 4;
                        i++;
                    }
                    else {
                        sum += 9;
                        i++;
                    }
                }
                else if (s.charAt(i) == 'X' && i < s.length() - 1
                        && (s.charAt(i + 1) == 'L' || s.charAt(i + 1) == 'C')) {
                    if (s.charAt(i + 1) == 'L') {
                        sum += 40;
                        i++;
                    }
                    else {
                        sum += 90;
                        i++;
                    }
                }
                else if (s.charAt(i) == 'C' && i < s.length() - 1
                        && (s.charAt(i + 1) == 'D' || s.charAt(i + 1) == 'M')) {
                    if (s.charAt(i + 1) == 'D') {
                        sum += 400;
                        i++;
                    }
                    else {
                        sum += 900;
                        i++;
                    }
                }
                else {
                    sum += roman.get(s.charAt(i));
                }
            }
            return sum;

        }
        private static void init(){
            roman.put('I', 1);
            roman.put('V', 5);
            roman.put('X', 10);
            roman.put('L', 50);
            roman.put('C', 100);
            roman.put('D', 500);
            roman.put('M', 1000);
        }
    }
}
