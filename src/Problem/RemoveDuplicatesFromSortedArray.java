package Problem;

public class RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates(int[] nums) {
        int k = 0;
        System.out.println("Initial array: " + java.util.Arrays.toString(nums));
        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            System.out.println("nums[" + i + "] = " + x);
            if (k == 0 || x != nums[k - 1]) {
                System.out.println("nums[" + k + "] is updated to " + x);
                nums[k++] = x;
                System.out.println("New array: " + java.util.Arrays.toString(nums));
            } else {
                System.out.println("nums[" + i + "] is a duplicate of nums[" + (k - 1) + "] = " + nums[k - 1]);
            }
        }
        System.out.println("Final array with duplicates removed: " + java.util.Arrays.toString(nums));
        System.out.println("Number of unique elements: " + k);
        return k;
    }

}
