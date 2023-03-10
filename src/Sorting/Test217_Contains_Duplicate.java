package Sorting;

import java.util.HashSet;

public class Test217_Contains_Duplicate {
    class Solution {
        public boolean containsDuplicate(int[] nums) {
            HashSet<Integer> set = new HashSet<>();
            for (int key:nums) {
                if (set.contains(key))return true;
                set.add(key);
            }
            return false;
        }
    }
}
