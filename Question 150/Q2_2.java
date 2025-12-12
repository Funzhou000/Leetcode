import java.util.Arrays;

public class Q2_2 {
    public static void main(String[] args) {
        int[] nums = { 0, 1, 2, 2, 3, 0, 4, 2 };
        int val = 2;
        int count = nums.length;
        for (int i = 0; i < nums.length;) {
            if (nums[i] == val) {
                move(nums, i);
                if (nums[i] != val) {
                    i++;
                }

            }
        }
        System.out.println(count);
        System.out.println(Arrays.toString(nums));
    }

    public static void move(int[] nums, int index) {

        for (int i = index; i < nums.length; i++) {
            if (i != nums.length - 1) {
                int temp = 0;
                temp = nums[i];
                nums[i] = nums[i + 1];
                nums[i + 1] = temp;
            }
        }

    }

}
