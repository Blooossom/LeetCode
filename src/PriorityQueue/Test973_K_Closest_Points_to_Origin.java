package PriorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Test973_K_Closest_Points_to_Origin {
    class Solution {
        public int[][] kClosest(int[][] points, int k) {
            PriorityQueue<int[]> queue = new PriorityQueue<>(Comparator.comparingInt(o -> (o[0] * o[0] + o[1] * o[1])));
            /*{
                if ((Math.pow(o1[0], 2) + Math.pow(o1[1], 2))
                        > (Math.pow(o2[0], 2) + Math.pow(o2[1], 2))) {
                    return 1;
                }
                else if ((Math.pow(o1[0], 2) + Math.pow(o1[1], 2))
                        == (Math.pow(o2[0], 2) + Math.pow(o2[1], 2))) {
                    return 0;
                }
                else {
                    return -1;
                }*/
            for (int i = 0; i < points.length; i++) {
                queue.offer(points[i]);
            }
            int[][] answer = new int[k][2];
            for (int i = 0; i < answer.length; i++) {
                answer[i] = queue.poll();
            }
            return answer;
        }
    }
}
