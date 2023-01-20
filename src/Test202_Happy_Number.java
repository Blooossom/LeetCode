import java.util.HashSet;

public class Test202_Happy_Number {
    class Solution{
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
}
