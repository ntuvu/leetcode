package Problem;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> m = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            int y = target - x;
            if (m.containsKey(y)) {
                return new int[]{m.get(y), i};
            }
            m.put(x, i);
        }
        return new int[0];
    }
}
