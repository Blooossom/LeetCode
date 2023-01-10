import java.io.*;
import java.util.Arrays;

public class Test16_3Sum_Closest {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(br.readLine());
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int param = Integer.parseInt(br.readLine());
        System.out.println(threeSumClosest(arr, param));

    }
    static int threeSumClosest(int[] arr, int target) {
        int length = arr.length;
        Arrays.sort(arr);
        int result = Integer.MAX_VALUE;
        for (int i = 0; i < length - 2; i++) {
            int sp = i + 1;
            int ep = length - 1;

            while (sp < ep) {
                int sum = arr[i] + arr[sp] + arr[ep];

                if (Math.abs(target - result) > Math.abs(target - sum)) {
                    result = sum;
                }
                if (sum < target) {
                    sp++;
                }
                else {
                    ep--;
                }
            }
        }
        return result;
    }
}
