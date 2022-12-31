import java.io.*;
import java.util.Arrays;

public class Test338_Counting_Bits {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        System.out.println(Arrays.toString(countingBits(input)));
    }
    static int[] countingBits(int param) {
        int[] dp = new int[param + 1];

        for (int i = 0; i < param + 1; i++) {
            dp[i] = Integer.bitCount(i);
        }
        return dp;
    }
}
