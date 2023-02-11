package PriorityQueue;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Test435_Non_overlapping_Intervals {
    public static void main(String[] args) {
        int[][] arr = {{1,2}, {2,3},{3,4},{1,3}};
        System.out.println(Solution.eraseOverlapIntervals(arr));
    }
    static class Solution {
        public static int eraseOverlapIntervals(int[][] intervals) {
            PriorityQueue<int[]> queue = new PriorityQueue<>((o1, o2) -> o1[1] - o2[1]);
            for (int[] arr:intervals) {
                queue.offer(arr);
            }
            int[] tmp = queue.poll();
            int answer = 0, temp = tmp[1];
            while (!queue.isEmpty()) {
                int[] arr = queue.poll();
                if (arr[0] < temp) {
                    answer++;
                }
                else {
                    temp = arr[1];
                }
            }
            return answer;

        }
    }
}
