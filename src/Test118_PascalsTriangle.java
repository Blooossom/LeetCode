import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test118_PascalsTriangle {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(generate(n));
    }
    static List<List<Integer>> generate(int numRows) {
        int[][] dp = new int[30][30];
        List<List<Integer>> answer = new ArrayList<>();
        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = 1;
        }
        for (int i = 1; i < dp.length; i++) {
            dp[i][i] = 1;
        }
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
            }
        }
        for (int i = 0; i < dp.length; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < i+1; j++) {
                list.add(dp[i][j]);
            }
            answer.add(list);
        }
        return answer;

    }
}
