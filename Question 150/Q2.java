import java.util.Arrays;
import java.util.Comparator;

public class Q2 {
    public static void main(String[] args) {
        int[] nums = { 0, 3, 5, 9, 12, 5 };
        int val = 5;

        int temp;
        int k = removeElement(nums, val);
        int j = 0;
        int i = nums.length - 1;
        while (j < i) {
            temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            j++;
            i--;
        }
        System.out.println(k);
        System.out.println(Arrays.toString(nums));
    }

    private static int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                nums[i] = -1;
                k++;
            }
        }
        Arrays.sort(nums);
        return k;
    }
}
