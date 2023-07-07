package Array;

import java.util.Arrays;

public class Test1_Two_Sum {
    static class Solution {
        public static int[] twoSum(int[] nums, int target) {
            int[] result = new int[2];
            int sp = 0;
            int ep = 1;
            while (true) {
                if (nums[sp] + nums[ep] == target) {
                    result[0] = sp;
                    result[1] = ep;
                    break;
                }
                if (ep >= nums.length - 1) {
                    sp++;
                    ep = sp + 1;
                }
                else {
                    ep++;
                }
            }
            return result;
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        System.out.println(Arrays.toString(Solution.twoSum(arr, 9)));
    }
}
