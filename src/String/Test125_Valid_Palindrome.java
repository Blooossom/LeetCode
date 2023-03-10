package String;

import java.util.Arrays;
import java.util.Objects;
import java.util.StringTokenizer;

public class Test125_Valid_Palindrome {
    public static void main(String[] args) {
        System.out.println(Solution.isPalindrome("0P"));
    }
    static class Solution{
        public static boolean isPalindrome(String s) {
            StringTokenizer removeBlank = new StringTokenizer(s);
            String str = "";
            while(removeBlank.hasMoreTokens()) {
                str = str + removeBlank.nextToken();
            }
            StringBuilder input = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                if ((str.charAt(i) >= 65 && str.charAt(i) <= 90) ||
                        (str.charAt(i) >= 97 && str.charAt(i) <= 122) ||
                        (str.charAt(i) >= 48 && str.charAt(i) <= 57)) {
                    input.append(str.charAt(i));
                }
            }
            return palindrome(input.toString());
        }
        private static boolean palindrome(String input) {
            String temp = input.toLowerCase();
            String[] arr = temp.split("");
            int sp = 0;
            int ep = arr.length - 1;
            while(sp < ep) {
                if (!Objects.equals(arr[sp], arr[ep])) {
                    return false;
                }
                sp++;
                ep--;
            }
            return true;

        }
    }
}
