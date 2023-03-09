package BackTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test51_N_Queens {
    public static void main(String[] args) {
        int param = 4;
        System.out.println(Solution.solveNQueens(param));

    }
    static class Solution {
        private static int  arr[];
        public static List<List<String>> solveNQueens(int n) {
            List<List<String>> answer = new ArrayList<>();
            arr = new int[n];
            queen(0, n, answer);
            return answer;
        }
        private static void queen(int row, int n, List<List<String>> answer) {
            if(row == n) {
                List<String> list = new ArrayList<>();
                String[] temp = new String[arr.length];
                for (int i = 0; i < arr.length; i++) {
                    Arrays.fill(temp, ".");
                    temp[arr[i]] = "Q";
                    String input = "";
                    for (String param:temp) {
                        input = input + param;
                    }
                    list.add(input);
                }
                answer.add(new ArrayList<>(list));
                return;
            }
            for (int i = 0; i < n; i++) {
                arr[row] = i;
                if (isPossible(row)) {
                    queen(row + 1, n, answer);
                }
            }
        }
        private static boolean isPossible(int col) {
            for (int i = 0; i < col; i++) {
                if (arr[col] == arr[i]) {
                    return false;
                }
                else if (Math.abs(col - i) == Math.abs(arr[col] - arr[i])) {
                    return false;
                }
            }
            return true;
        }
    }
}
