import java.io.*;
import java.util.Arrays;

public class Test283_Move_Zeroes {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        int sp = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[sp] = nums[i];
                sp++;
            }
        }
        while (true) {
            if (sp >= nums.length) {
                break;
            }
            nums[sp] = 0;
            sp++;
        }
        System.out.println(Arrays.toString(nums));
    }
}
