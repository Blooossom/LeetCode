package BackTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test90_Subsets_ll {
    public static void main(String[] args) {
        int[] arr = {0};
        System.out.println(Solution.subsetsWithDup(arr).toString());
    }
    static class Solution {

        public static List<List<Integer>> subsetsWithDup(int[] nums) {
            List<List<Integer>> answer = new ArrayList<>();
            Arrays.sort(nums);
            recursive(nums, 0, new ArrayList<>(), answer);
            return answer;
        }
        private static void recursive(int[] arr, int param, ArrayList<Integer> list, List<List<Integer>> answer) {
            if (!answer.contains(list)) {
                answer.add(new ArrayList<>(list));
            }


            for (int i = param; i < arr.length; i++) {
                list.add(arr[i]);
                recursive(arr, i + 1, list, answer);
                list.remove(list.size() - 1);
            }
        }

    }
}
