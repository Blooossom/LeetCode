package BinarySearch;

public class Test441_Arranging_Coins {
    class Solution {
        public int arrangingCoins(int input) {
            long sp = 0, ep = input;
            long mid, s;
            while (sp <= ep) {
                mid = sp + (ep - 1) / 2;
                s = mid * (mid + 1) / 2;
                if (s == input) {
                    return (int)mid;
                }
                if (input < s) {
                    ep = mid - 1;
                }
                else {
                    sp = mid + 1;
                }
            }
            return (int) ep;
        }
    }
}
