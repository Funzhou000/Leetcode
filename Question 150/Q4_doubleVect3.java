import java.util.Arrays;

public class Q4_doubleVect3 {
    public static void main(String[] args) {
        int[] nums = { 0, 0, 1, 1, 1, 1, 2, 2, 3, 3, 4 };
        int writer = 0;
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            // i is scort
            if (nums[writer] == nums[i]) {
                count++;
            }
            if (nums[writer] != nums[i] && count == 2) {
                writer = i;
                count = 1;
            }
            if (nums[writer] != nums[i]) {
                nums[writer] = nums[i];
            }
            if (count == 3) {
                writer = i;
            }
            if (nums[writer] != nums[i] && count > 2) {

                nums[writer] = nums[i];

                count = 1;
            }

        }
        System.out.println();// 9
        System.out.println(Arrays.toString(nums));// [0,0,1,1,2,2,3,3,44]
    }
}
