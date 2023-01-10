import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Test15_3Sum {
    List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new LinkedList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int sp = i + 1;
            int ep = nums.length - 1;

            while(true) {
                if (sp >= ep){
                    break;
                }
                int sum = nums[sp] + nums[ep] + nums[i];
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[sp], nums[ep]));
                    sp++;
                    ep--;
                    while (true) {
                        if (nums[sp] != nums[sp - 1] || sp >= ep){
                            break;
                        }
                        sp++;
                    }
                    while (true) {
                        if (nums[ep] != nums[ep + 1] || sp >= ep) {
                            break;
                        }
                        ep--;
                    }

                }
                else if (sum > 0) {
                    ep--;
                }
                else {
                    sp++;
                }
            }
        }
        return result;
    }
}
