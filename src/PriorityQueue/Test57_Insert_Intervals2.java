package PriorityQueue;

import java.util.ArrayList;
import java.util.List;

public class Test57_Insert_Intervals2 {
    class Soution {
        public int[][] insert(int[][] intervals, int[] newInterval) {
            List<int[]> answer = new ArrayList<>();
            for (int[] arr:intervals) {
                if (arr[1] < newInterval[0]) {
                    answer.add(arr);
                }
                else if (newInterval[1] < arr[0]) {
                    answer.add(newInterval);
                    newInterval = arr;
                }
                else {
                    newInterval[0] = Math.min(newInterval[0], arr[0]);
                    newInterval[1] = Math.max(newInterval[1], arr[1]);
                }
            }
            answer.add(newInterval);
            return answer.toArray(new int[answer.size()][]);
        }
    }
}
