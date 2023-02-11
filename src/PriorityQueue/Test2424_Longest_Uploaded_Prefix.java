package PriorityQueue;

import java.util.PriorityQueue;

public class Test2424_Longest_Uploaded_Prefix {
    class LUPrefix {
        int max = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        public LUPrefix(int n) {
        }

        public void upload(int video) {
            if (video == max + 1) {
                max++;
            }
            else {
                queue.add(video);
            }
            if (queue.size() > 0) {
                while(queue.size() > 0 && queue.peek() == max + 1) {
                    queue.poll();
                    max++;
                }
            }
        }

        public int longest() {
            return max;
        }
    }
}
