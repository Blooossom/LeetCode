package Array;

import java.util.HashMap;

public class Test1512_Number_of_Good_Pairs {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,3};
        System.out.println(Solution.numIdenticalPairs(nums));
    }
    static class Solution {
        public static int numIdenticalPairs(int[] nums) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int num : nums) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
            int count = 0;
            for (int key:map.keySet()) {
                if (map.get(key) > 1) {
                    int param = map.get(key);
                    count += (param * (param - 1)) / 2;
                }
            }
            return count;
        }
    }
}
