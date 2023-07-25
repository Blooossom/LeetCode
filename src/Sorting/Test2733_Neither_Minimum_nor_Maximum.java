package Sorting;

import java.util.Arrays;

public class Test2733_Neither_Minimum_nor_Maximum {
    class Solution {
        public int findNorMinOrMax(int[] nums) {
            if (nums.length <= 2) {
                return -1;
            }
            Arrays.sort(nums);
            return nums[1];
        }
    }
}
