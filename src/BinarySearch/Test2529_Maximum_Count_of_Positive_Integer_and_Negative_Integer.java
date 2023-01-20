package BinarySearch;

public class Test2529_Maximum_Count_of_Positive_Integer_and_Negative_Integer {
    class Solution{
        public int maximumCount(int[] nums) {
            int target = 0;
            int max;
            if (binarySearch(nums, target) == -1) {
                    return nums.length;
            }
            else {
                int idx = binarySearch(nums, target);
                int sp = findSp(nums, idx);
                int ep = findEp(nums, idx);
                max = Math.max(sp + 1, nums.length - ep);
            }
            return max;
        }
        static int binarySearch(int[] arr, int target) {
            int sp = 0;
            int ep = arr.length - 1;
            int mid = (sp + ep) / 2;
            while (ep - sp >= 0) {
                if (arr[mid] == target) {
                    return mid;
                }
                else if (arr[mid] < target) {
                    sp = mid + 1;
                }
                else {
                    ep = mid - 1;
                }
            }
            return -1;
        }
        static int findSp(int[] arr, int idx){
            while (arr[idx] == 0) {
                idx--;
            }
            return idx;
        }
        static int findEp(int[] arr, int idx) {
            while (arr[idx] == 0) {
                idx++;
            }
            return idx;
        }
    }
}
