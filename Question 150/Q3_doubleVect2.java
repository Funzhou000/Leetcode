import java.util.Arrays;

public class Q3_doubleVect2 {
    public static void main(String[] args) {
        int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        int scort = 1;
        int writer = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[writer]) {
                nums[++writer] = nums[i];
            }
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(writer + 1);
    }
}
