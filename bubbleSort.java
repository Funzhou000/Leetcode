import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 2, 7, 9 };
        bubbleSorts(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSorts(int[] arr) {
        for (int j = 0; j < arr.length - 1; j++) {
            for (int i = 0; i < arr.length - 1 - j; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }
}
