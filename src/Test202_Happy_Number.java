import java.io.*;
import java.util.HashSet;

public class Test202_Happy_Number {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        System.out.println(isHappy(input));
    }
    static boolean isHappy(int param) {
        HashSet<Integer> set = new HashSet<>();

        while (param != 1) {
            int temp = param;
            int sum = 0;

            while (temp != 0) {
                int div = temp % 10;
                sum += div * div;
                temp /= 10;
            }
            if (set.contains(sum)) {
                return false;
            }
            param = sum;
            set.add(param);
        }
        return true;
    }
}
