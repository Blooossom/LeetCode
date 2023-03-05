package Array;

public class Test1929_Concatenation_of_Array {
    class Solution {
        public int[] getConcatenation(int[] nums) {
            int[] answer = new int[nums.length * 2];
            for (int i = 0; i < answer.length; i++) {
                answer[i] = i >= nums.length? nums[i - nums.length]:nums[i];
            }
            return answer;
        }
    }
}
