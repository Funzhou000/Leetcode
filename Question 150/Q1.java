import java.util.Arrays;

public class Q1 {
    public static void main(String[] args) {

        int m = 3;
        int n = 3;
        int nums2[] = { 2, 5, 6 };
        int[] nums1 = { 1, 2, 3, 0, 0, 0 };
        doubleVector(m, n, nums1, nums2);
        System.out.println(Arrays.toString(nums1));
        // ONlogN(m, n, nums2, nums1);
    }

    private static void doubleVector(int m, int n, int[] nums1, int[] nums2) {
        int count = 0;
        int i = 0, j = 0, k = 0;
        int[] ans = new int[n + m];
        while (true) {
            if (nums1[i] < nums2[j]) {
                ans[k++] = nums1[i++];
                count++;
            } else if (nums1[i] >= nums2[j]) {
                ans[k++] = nums2[j++];
                count++;
            }
            if (count == m + n)
                break;
        }
        nums1 = ans;

    }

    private static void ONlogN(int m, int n, int[] nums2, int[] nums1) {

        nums1 = nums2;
        if (n > 0) {
            int j = 0;
            for (int i = m; i < nums1.length; i++) {
                nums1[i] = nums2[j++];

            }
            Arrays.sort(nums1);
        }
        System.out.println(Arrays.toString(nums1));
    }
}
