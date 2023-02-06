package PriorityQueue;

import java.util.*;

public class Test506_Relative_Ranks {
    public static void main(String[] args) {
        int[] score = {10,3,8,9,4};
        System.out.println(Arrays.toString(Solution.findRelativeRanks(score)));
    }
    static class Solution {
        public static String[] findRelativeRanks(int[] score) {
            PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
            for (int param:score) {
                queue.offer(param);
            }
            LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
            for (int key:score) {
                map.put(key, "");
            }
            String[] answer = new String[score.length];
            int rank = 1;
            String[] medal = {"Gold Medal", "Silver Medal", "Bronze Medal"};
            while(!queue.isEmpty()) {
                int key = queue.poll();
                if (rank > 3) {
                    map.put(key, String.valueOf(rank));
                }
                else {
                    map.put(key, medal[rank - 1]);
                }
                rank++;
            }
            int i = 0;
            for (int key : map.keySet()) {
                answer[i] = map.get(key);
                i++;
            }
            return answer;
        }
    }
}
