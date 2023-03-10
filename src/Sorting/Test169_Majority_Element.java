package Sorting;

import java.util.HashMap;

public class Test169_Majority_Element {
    public static void main(String[] args) {
        int[] arr = {3, 3, 4};
        System.out.println(Solution.majorityElement(arr));
    }
    static class Solution {

        public static int majorityElement(int[] nums) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int key:nums) {
                map.put(key, map.getOrDefault(key, 0) + 1);
            }
            System.out.println(map);

            int max = 0;
            int answer = 0;
            for (int key:map.keySet()) {
                if (max < map.get(key)) {
                    max = map.get(key);
                    answer = key;
                }
            }
            return answer;
        }
    }
}
