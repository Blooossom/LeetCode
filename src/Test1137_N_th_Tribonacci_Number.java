import java.io.*;
public class Test1137_N_th_Tribonacci_Number {
    static int[] dp;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        dp = new int[N + 1];
        System.out.println(tribonacci(N));
    }
    static int tribonacci(int n) {
        if (n == 1 || n == 2) {
            return dp[n] = 1;
        }
        if (n == 0) {
            return dp[n] = 0;
        }
        if (dp[n] != 0) {
            return dp[n];
        }
        else {
            return dp[n] = tribonacci(n - 1) + tribonacci(n - 2) + tribonacci(n - 3);
        }
    }
}
