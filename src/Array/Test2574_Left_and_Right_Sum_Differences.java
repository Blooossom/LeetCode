package Array;

import java.util.Arrays;

public class Test2574_Left_and_Right_Sum_Differences {
    public static void main(String[] args) {
        int[] nums = {10, 4, 8, 3};
        System.out.println(Solution.leftRightDifference(nums));
    }
    static class Solution {
        public static int[] leftRightDifference(int[] nums) {
            int[] leftSum = new int[nums.length];
            int[] rightSum = new int[nums.length];
            int[] answer = new int[nums.length];
            int sum = 0;
            for (int param:nums) {
                sum += param;
            }
            for (int i = 0; i < nums.length - 1; i++) {
                sum -= nums[i];
                rightSum[i] = sum;
            }
            for (int i = 1; i < nums.length; i++) {
                leftSum[i] = nums[i - 1] + leftSum[i - 1];
            }
            for (int i = 0; i < nums.length; i++) {
                answer[i] = Math.abs(leftSum[i] - rightSum[i]);
            }
            return answer;
        }
    }
}
