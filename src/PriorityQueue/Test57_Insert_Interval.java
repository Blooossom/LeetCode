package PriorityQueue;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Test57_Insert_Interval {
    public static void main(String[] args) {
        int[][] arr = {{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}};
        int[] newInterval = {4, 8};
        System.out.println(Solution.insert(arr, newInterval));

    }
    static class Solution {
        public static int[][] insert(int[][] intervals, int[] newInterval) {
            PriorityQueue<int[]> queue = new PriorityQueue<>((o1, o2) -> o1[0] - o2[0]);
            int sp = newInterval[0];
            int ep = newInterval[1];
            int length = intervals.length;
            for (int i = 0; i < length; i++) {

                int left = intervals[i][0], right = intervals[i][1];
                if ((sp <= left && left <= ep) || (sp <= right && right <= ep)
                || ((left <= sp && sp <= right) && (left <= ep && ep <= right))){

                    sp = Math.min(sp, left);
                    ep = Math.max(ep, right);

                }
                else {
                    queue.offer(intervals[i]);
                }
            }

            queue.add(new int[] {sp, ep});

            int size = queue.size();

            int[][] result = new int[size][2];

            for (int i = 0; i < size; i++) {
                int[] temp = queue.remove();
                result[i] = temp;
            }
            for (int i = 0; i < result.length; i++) {
                System.out.println(Arrays.toString(result[i]));
            }

            return result;
        }
    }
}
