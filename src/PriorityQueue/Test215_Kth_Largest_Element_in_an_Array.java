package PriorityQueue;

import java.util.Collections;
import java.util.PriorityQueue;

public class Test215_Kth_Largest_Element_in_an_Array {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 5, 6, 4};
        int k = 2;
        System.out.println(Solution.findKthLargest(arr, k));
    }
    static class Solution {
        public static int findKthLargest(int[] nums, int k) {
            PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
            for (int key:nums) {
                queue.offer(key);
            }
            while (k > 1) {
                queue.poll();
                k--;
            }
            return queue.poll();
        }
    }
}
