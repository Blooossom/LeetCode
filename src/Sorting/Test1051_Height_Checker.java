package Sorting;

import java.util.Arrays;

public class Test1051_Height_Checker {
    class Solution {
        public int heightChecker(int[] heights) {
            int[] cloneHeights = Arrays.copyOf(heights, heights.length);
            Arrays.sort(cloneHeights);
            int result = 0;
            for (int i = 0; i < heights.length; i++) {
                if (cloneHeights[i] != heights[i]) {
                    result++;
                }
            }
            return result;
        }
    }
}
