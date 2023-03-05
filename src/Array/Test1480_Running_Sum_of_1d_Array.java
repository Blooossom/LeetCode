package Array;

public class Test1480_Running_Sum_of_1d_Array {
    class Solution {
        public int[] runningSum(int[] nums) {
            int[] prefixSum = new int[nums.length];
            prefixSum[0] = nums[0];
            for (int i = 1; i < nums.length; i++) {
                prefixSum[i] = nums[i] + prefixSum[i - 1];
            }
            return prefixSum;
        }
    }
}
