package BinarySearch;

public class Test278_First_Bad_Version {
    public class Solution {
        public int firstBadVersion(int param) {
            int left = 1, right = param;
            while (left < right) {
                int mid = left + (right - left) / 2;
                if (!isBadVersion(mid)) {
                    left = mid + 1;
                }
                else {
                    right = mid;
                }
            }
            return left;
        }
    }
    static boolean isBadVersion(int version){
        return false;
    }
}
