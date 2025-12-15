import java.util.Arrays;

public class Q2_doubleVector {
    public static void main(String[] args) {
        int[] nums = { 3, 2, 2, 3 };
        int val = 2;

        int writer = 0;
        for (int i = 0; i < nums.length; i++) {
            // i=scort
            if (nums[i] != val) {

                nums[writer++] = nums[i];
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
