package Problem;

import java.util.Arrays;

public class SearchInsertPosition {

    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        System.out.println("nums: " + Arrays.toString(nums));
        System.out.println("first left: " + left);
        System.out.println("first right: " + right);
        System.out.println("target: " + target);

        System.out.println("Start loop-----------------");
        while (left <= right) {
            int mid = left + (right - left) / 2;
            System.out.println("mid index: " + mid);
            System.out.println("mid value: " + nums[mid]);
            if (nums[mid] == target) {
                System.out.println("mid value = target");
                return mid;
            } else if (nums[mid] > target) {
                System.out.println("mid value > target");
                right = mid - 1;
            } else {
                System.out.println("mid value < target");
                left = mid + 1;
            }
        }

        System.out.println("inserted index: " + left);
        return left;
    }
}
