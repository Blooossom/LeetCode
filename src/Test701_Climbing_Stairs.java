import java.io.*;
public class Test701_Climbing_Stairs {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        System.out.println(climbStairs(input));
    }
    static int climbStairs(int param) {
        if (param <= 1) {
            return 1;
        }
        int[] dp = new int[param + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i < param + 1; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[param];
    }
}
