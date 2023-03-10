package Graph;

import java.util.HashMap;

public class Test1791_Find_Center_of_Star_Graph {
    class Solution {
        public int findCenter(int[][] edges) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < edges.length; i++) {
                for (int j = 0; j < edges[i].length; j++) {
                    int key = edges[i][j];
                    map.put(key, map.getOrDefault(key, 0) + 1);
                }
            }
            int answer = 0;
            int max = 0;
            for (int key:map.keySet()) {
                if (max < map.get(key)) {
                    max = map.get(key);
                    answer = key;
                }
            }
            return answer;
        }
    }
}
