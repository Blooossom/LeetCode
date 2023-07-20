package Array;

public class Test136_SingleNumber {
    private static int[] arr = new int[60001];
    class Solution {
        public int singleNumber(int[] nums) {
            int result = 0;
            for (int i = 0; i < nums.length; i++) {
                arr[nums[i] + 30000]++;
            }
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 1) {
                    result =  i - 30000;
                }
            }
            return result;
        }
    }
}
