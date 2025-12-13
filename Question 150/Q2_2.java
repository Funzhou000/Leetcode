import java.util.Arrays;

public class Q2_2 {
    public static void main(String[] args) {
        int[] nums = { 0, 1, 2, 2, 3, 0, 4, 2 };
        int val = 2;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                count++;
            }
        }
        for (int i = 0; i < nums.length - count; i++) {
            // 指向当前数
            while (nums[i] == val) {
                moves(nums, i);
            }
        }
        System.out.println(Arrays.toString(nums));

    }

    public static void moves(int[] nums, int i) {
        // 传递数组和当前索引
        for (int j = i; j <= nums.length - 2; j++) {
            int temp = nums[j];
            nums[j] = nums[j + 1];
            nums[j + 1] = temp;
        }

    }
}