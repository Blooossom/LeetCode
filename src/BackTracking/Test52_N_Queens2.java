package BackTracking;

public class Test52_N_Queens2 {
    class Solution {
        private static int n, count, arr[];
        public int totalNQueens(int n) {
            Solution.n = n;
            count = 0;
            arr = new int[n];
            queen(0);
            return count;
        }
        private static void queen(int row) {
            if(row == n) {
                count++;
                return;
            }
            for (int i = 0; i < n; i++) {
                arr[row] = i;
                if (isPossible(row)) {
                    queen(row + 1);
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
