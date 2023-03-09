package BackTracking;

import java.util.ArrayList;
import java.util.List;

public class Test401_Binary_Watch {
    class Solution {
        private static List<String> answer = new ArrayList<>();
        int[] clock = new int[2];
        public List<String> readBinaryWatch (int turnedOn) {
                return new ArrayList<>();
        }
        private boolean isPossible() {
            if (clock[1] < 60 && clock[0] < 12) {
                return true;
            }
            return false;
        }
        private void recursive(int on, int p) {
            if (on == 0) {
                String time = getString(clock);
                answer.add(time);
                return;
            }
            for (int i = p; i < 10; i++) {
                int num = 1 << (i % 6);
                if (i < 6) {
                    clock[1] += num;
                    if (isPossible()){
                        recursive(on - 1, i + 1);

                    }
                    clock[1] -= num;
                }
                else {
                    clock[0] += num;
                    if (isPossible()) {
                        recursive(on - 1, i + 1);
                    }
                    clock[0] -= num;
                }
            }
        }
        private String getString(int[] mark) {
            StringBuilder sb = new StringBuilder();
            sb.append(mark[0]);
            sb.append(":");
            if (mark[1] < 10) {
                sb.append(0);
            }
            sb.append(mark[1]);
            return sb.toString();
        }
    }
}
