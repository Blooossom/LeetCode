package BinarySearch;

public class Test441_Arranging_Coins {
    class Solution {
        public int arrangingCoins(int input) {
            long sp = 0, ep = input;
            long x, s;
            while (sp <= ep) {
                x = sp + (ep - 1) / 2;
                s = x * (x + 1) / 2;
                if (s == input) {
                    return (int)x;
                }
                if (input < s) {
                    ep = x - 1;
                }
                else {
                    sp = x + 1;
                }
            }
            return (int) ep;
        }
    }
}
