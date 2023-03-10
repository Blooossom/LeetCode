public class Test42_Trapping_Rain_Water {
    class Solution {
        public int trap(int[] height) {
            int sp = 0, ep = height.length - 1;
            int maxSp = 0, maxEp = 0, sum = 0;

            while (sp < ep) {
                if (height[sp] < height[ep]) {
                    if (height[sp] >= maxSp) {
                        maxSp = height[sp];
                    }
                    else {
                        sum += maxSp - height[sp];
                    }
                    sp++;
                }
                else {
                    if (height[ep] >= maxEp) {
                        maxEp = height[ep];
                    }
                    else {
                        sum += maxEp - height[ep];
                    }
                    ep--;
                }
            }
            return sum;
        }
    }
}
