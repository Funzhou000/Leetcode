import java.util.Arrays;

public class Q5 {
    public static void main(String[] args) {
        int[] nums = { 3, 2, 3 };
        int n = nums.length / 2;
        Arrays.sort(nums);
        for (int i = n; i < nums.length; i++) {
            if (nums[i] == nums[i - n]) {
                System.out.println(nums[i]);
                break;
            }
        }
    }
}
