import java.util.Map;

public class Q5solution2 {
    public static void main(String[] args) {
        int[] nums = { 1, 1, 1, 2, 2, 5, 5, 5, 5, 6, 6, 7 };
        int maximum = 0;
        Map<Integer, Integer> result = countFrequencies(nums);
        for (Map.Entry<Integer, Integer> entry : result.entrySet()) {
            maximum = entry.getValue() > maximum ? entry.getValue() : maximum;
        }
        for (int i : result.keySet()) {
            if (maximum == result.get(i)) {
                System.out.println(i);
                break;
            }
        }

    }

    private static Map<Integer, Integer> countFrequencies(int[] nums) {
        Map<Integer, Integer> map = new java.util.HashMap<>();
        for (int i : nums) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }
        return map;

    }
}
