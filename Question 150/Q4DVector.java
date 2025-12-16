import java.util.Arrays;

public class Q4DVector {
    public static void main(String[] args) {
        int slow = 2, fast = 2;
        int[] nums = { 0, 1, 1, 1, 2, 2, 2, 3 };
        while (fast < nums.length) {
            if (nums[slow - 2] != nums[fast]) {
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        System.out.println(Arrays.toString(nums));
    }
}
