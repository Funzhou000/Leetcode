import java.util.Arrays;
import java.util.Queue;

public class RotateArrayTrying1 {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3;
        rotate(nums, k);
        System.out.println(Arrays.toString(nums));
    }

    private static void rotate(int[] nums, int step) {
        Queue<Integer> queue = new java.util.LinkedList<>();
        for (int i = 0; i < step; i++) {
            queue.add(nums[nums.length - 1]);
            for (int j = nums.length - 2; j >= 0; j--) {
                nums[j + 1] = nums[j];
            }
            nums[0] = queue.poll();
        }
    }
}// O(n*k) time complexity and O(1) space complexity
