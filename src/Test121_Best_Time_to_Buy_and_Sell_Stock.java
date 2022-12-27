import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Test121_Best_Time_to_Buy_and_Sell_Stock {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(maxProfit(arr));
    }
    static int maxProfit(int[] prices){
        int n = prices.length;
        int[][] dp = new int[n + 1][n + 1];
        for (int i = 1; i < n + 1; i++) {
            dp[0][i] = prices[i - 1];
        }

        for (int i = 1; i < n + 1; i++) {
            dp[i][0] = prices[i - 1];
        }
        int max = 0;
        for (int i = 2; i < dp.length; i++) {
            for (int j = 1; j < i; j++) {
                dp[i][j] = dp[i][0] - dp[0][j];
                if(max < dp[i][j]) {
                    max = dp[i][j];
                }
            }
        }
        return max;
    }
}
