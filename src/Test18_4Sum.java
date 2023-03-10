import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Test18_4Sum {
    class Solution {
    static List<List<Integer>> fourSum(int[] arr, int target) {
        HashSet<List<Integer>> set = new HashSet<>();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 3; i++) {
            for (int j = i + 1; j < arr.length - 2; j++) {

                int sp = j + 1;
                int ep = arr.length - 1;
                while (sp < ep) {
                    long temp = (long)arr[i] + arr[j] + arr[sp] + arr[ep];
                    if (temp == target) {
                        set.add(Arrays.asList(arr[i], arr[j], arr[sp], arr[ep]));
                        sp++;
                    }
                    else if (temp > target) {
                        ep--;
                    }
                    else {
                        sp++;
                    }
                }
            }
        }
        return new ArrayList<>(set);
    }
    }
}
