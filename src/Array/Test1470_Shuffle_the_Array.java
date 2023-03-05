package Array;

public class Test1470_Shuffle_the_Array {
    class Solution {
        public int[] shuffle(int[] nums, int n) {
            int[] preSub = new int[n];
            int[] postSub = new int[n];
            for (int i = 0; i < nums.length; i++) {
                if (i >= n) {
                    postSub[i - n] = nums[i];
                }
                else {
                    preSub[i] = nums[i];
                }
            }
            int[] answer = new int[2 * n];
            for (int i = 0; i < 2 * n; i++) {
                answer[i] = i % 2 == 0? preSub[i / 2]:postSub[i / 2];
            }
            return answer;
        }
    }
}
