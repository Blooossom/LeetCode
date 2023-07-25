package Sorting;

import java.util.LinkedList;
import java.util.Queue;

public class Test922_Sort_Array_By_Party_2 {
    class Solution {
        public int[] sortArrayByParty2(int[] nums) {
            Queue<Integer> oddQueue = new LinkedList<>();
            Queue<Integer> evenQueue = new LinkedList<>();
            int[] result = new int[nums.length];
            for (int param:nums) {
                if (param % 2 == 0) {
                    evenQueue.offer(param);
                }
                else {
                    oddQueue.offer(param);
                }
            }
            for (int i = 0; i < nums.length; i++) {
                if (i % 2 == 0) {
                    result[i] = evenQueue.poll();
                }
                else {
                    result[i] = oddQueue.poll();
                }
            }
            return result;
        }
    }
}
