package BackTracking;

import java.util.ArrayList;
import java.util.List;

public class Test46_Permutations {
    class Solution {
        private List<List<Integer>> answer = new ArrayList<>();
        public List<List<Integer>> permute(int[] nums) {
            recursive(nums, new ArrayList<>(), new boolean[nums.length - 1]);
            return answer;
        }
        private void recursive(int[] arr,List<Integer> list, boolean[] possible) {
            if (list.size() == arr.length) {
                answer.add(new ArrayList<>(list));
                return;
            }
            for (int i = 0; i < arr.length; i++) {
                if (possible[i]) {
                    continue;
                }
                possible[i] = true;
                list.add(arr[i]);
                recursive(arr, list, possible);
                possible[i] = false;
                list.remove(list.size() - 1);
            }
        }
    }
}
