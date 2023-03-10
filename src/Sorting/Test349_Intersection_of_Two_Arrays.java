package Sorting;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Test349_Intersection_of_Two_Arrays {
    class Solution {
        public int[] intersection(int[] nums1, int[] nums2) {
            HashSet<Integer> set = new HashSet<>();
            for (int param:nums1) {
                set.add(param);
            }
            HashSet<Integer> answer = new HashSet<>();
            for (int i = 0; i < nums2.length; i++) {
                if (set.contains(nums2[i])) answer.add(nums2[i]);
            }
            int[] res = new int[answer.size()];
            List<Integer> list = new ArrayList<>(answer);
            for (int i = 0; i < answer.size(); i++) {
                res[i] = list.get(i);
            }
            return res;
        }
    }
}
