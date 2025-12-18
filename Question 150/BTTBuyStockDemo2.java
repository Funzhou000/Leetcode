import java.util.HashMap;

public class BTTBuyStockDemo2 {
    public static void main(String[] args) {
        int[] prices = { 7, 6, 4, 3, 1 };
        maxProfit(prices);
    }

    private static void maxProfit(int[] prices) {

        int maximun = 0;
        int min = 100000000;
        int vector;
        HashMap<Integer, Integer> map = new HashMap<>();
        // 找到一个数的最大差值所在的索引
        for (int i = 0; i < prices.length; i++) {
            min = Math.min(min, prices[i]);
            System.out.println(min);
            map.put(min, i);
        }

        vector = map.get(min);

        int maxMargin = 0;
        for (int i = prices.length - 1; i >= 0; i--) {
            // 找 vector 后的日子
            if (i >= vector) {
                if (maxMargin <= prices[i] - prices[vector]) {
                    maxMargin = prices[i] - prices[vector];
                }
            }
        }
        // System.out.println(maxMargin);

    }
}
