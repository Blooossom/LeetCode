package PriorityQueue;
import java.io.*;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Test1046_Last_Stone_Weight {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[] arr = new int[T];
        for (int i = 0; i < T; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        System.out.println(Solution.lastStoneWeight(arr));
    }
    static class Solution {
        public static int lastStoneWeight(int[] stones) {
            PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
            for (int key:stones) {
                queue.offer(key);
            }
            while (queue.size() > 1) {
                int p = queue.poll();
                int q = queue.poll();
                if (p != q) {
                    queue.offer(p - q);
                }
            }
            return queue.isEmpty()? 0 : queue.peek();
        }
    }
}
