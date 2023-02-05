package PriorityQueue;

import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

public class Test451_Sort_Characters_By_Frequency {
    public static void main(String[] args) {
       String str = "abbbaacacf";
        System.out.println(Solution.frequencySort(str));
    }
    static class Solution {
        public static String frequencySort(String s) {
            String[] arr = s.split("");
            HashMap<String, Integer> map = new HashMap<>();
            for (String key:arr) {
                map.put(key, map.getOrDefault(key, 0) + 1);
            }
            PriorityQueue<String> queue = new PriorityQueue<>((o1, o2) -> map.get(o2) - map.get(o1));
            for (String key:map.keySet()) {
                queue.offer(key);
            }
            StringBuilder sb = new StringBuilder();
            while(!queue.isEmpty()) {
                String key = queue.poll();
                for (int i = 0; i < map.get(key); i++) {
                    sb.append(key);
                }
            }
            return sb.toString();
        }
    }
}
