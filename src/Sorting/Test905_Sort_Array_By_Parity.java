package Sorting;

import java.util.ArrayList;
import java.util.List;

public class Test905_Sort_Array_By_Parity {
    class Solution {
        public int[] sortArrayByParity(int[] nums) {
            List<Integer> even = new ArrayList<>();
            List<Integer> odd = new ArrayList<>();
            for (int param : nums) {
                if (param % 2 == 0) {
                    even.add(param);
                } else {
                    odd.add(param);
                }
            }
            int[] res = new int[odd.size() + even.size()];
            for (int i = 0; i < res.length; i++) {
                res[i] = i < even.size() ? even.get(i) : odd.get(i - even.size());
            }
            return res;
        }
    }
}
