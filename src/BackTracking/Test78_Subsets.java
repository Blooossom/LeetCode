package BackTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test78_Subsets {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(Solution.subsets(arr));
    }
    static class Solution {
        public static List<List<Integer>> answer = new ArrayList<>();

        public static List<List<Integer>> subsets(int[] nums) {
            subset(nums, 0, new ArrayList<>());
            return answer;
        }
        public static void subset(int[] nums, int p, ArrayList<Integer> list) {
            answer.add(new ArrayList<>(list));
            for (int i = p; i < nums.length; i++) {
                list.add(nums[i]);
                subset(nums, i + 1, list);
                list.remove(list.size() - 1);
            }
        }
    }
}
