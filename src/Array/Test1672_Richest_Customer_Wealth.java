package Array;

public class Test1672_Richest_Customer_Wealth {
    class Solution {
        public int maximumWealth(int[][] accounts) {
            int answer = 0;
            for (int i = 0; i < accounts.length; i++) {
                int sum = 0;
                for (int j = 0; j < accounts[0].length; j++) {
                    sum += accounts[i][j];
                }
                answer = Math.max(answer, sum);
            }
            return answer;
        }
    }
}
