package Sorting;

import java.util.*;

public class Test414_Third_Maximum_Number {
    class Solution {
        public int thirdMax(int[] nums) {
            List<Integer> list = new ArrayList<>();
            for (int param:nums) {
                list.add(param);
            }

            Collections.reverse(list);
            LinkedHashSet<Integer> set = new LinkedHashSet<>(list);
            if (set.size() < 3) return list.get(0);
            int idx = 0;
            for (int key:set) {
                if (idx == 2) {
                    return key;
                }
                idx++;
            }
            return 0;
        }
    }
}
