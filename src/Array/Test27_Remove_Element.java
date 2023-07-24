package Array;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Arrays;

public class Test27_Remove_Element {
    public static void main(String[] args) {
        int[] arr = {3,2,2,3};
        int val = 3;
        System.out.println(Solution.removeElement(arr, val));
    }
    static class Solution {
        public static int removeElement(int[] nums, int val) {
            int idx = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != val) {
                    int tmp = nums[i];
                    nums[idx] = nums[i];
                    nums[i] = tmp;
                    idx++;
                }
            }
            return idx;
        }
    }
}
