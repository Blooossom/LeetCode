import java.io.*;
public class Test509_FibonacciNumber {
    static int[] dp = new int[31];
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(fib(n));
    }
    static int fib(int n){
        if(n == 1 || n == 2) {
            return dp[n] = 1;
        }
        if(dp[n] != 0) {
            return dp[n];
        }
        else {
            return dp[n] = fib(n - 2) + fib(n - 1);
        }
    }
}
