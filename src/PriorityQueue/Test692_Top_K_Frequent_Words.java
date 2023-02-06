package PriorityQueue;

import java.util.*;
import java.util.stream.Collectors;

public class Test692_Top_K_Frequent_Words {
    public static void main(String[] args) {
        String[] arr = {"the","day","is","sunny","the","the","the","sunny","is","is"};
        String[] arr2 = {"i","love","leetcode","i","love","coding"};
        int p = 2;
        int k = 4;


        System.out.println(Solution.topKFrequent(arr, 4));
        System.out.println(Solution.topKFrequent(arr2, p));
    }
    static class Solution {
        public static List<String> topKFrequent(String[] words, int k) {
            HashMap<String, Integer> map = new HashMap<>();
            for (String key:words) {
                map.put(key, map.getOrDefault(key, 0) + 1);
            }
            PriorityQueue<String> queue = new PriorityQueue<>((o1, o2) -> {
                if (map.get(o1) > map.get(o2)) {
                    return -1;
                }
                else if (map.get(o1) == map.get(o2)) {
                    return o1.compareTo(o2);
                }
                else {
                    return 1;
                }
            });
            for (String word: map.keySet()) {
                queue.offer(word);
            }
            List<String> answer = new ArrayList<>();
            for (int i = 0; i < k; i++) {
                answer.add(queue.poll());
            }
            return answer;
        }
    }
}
