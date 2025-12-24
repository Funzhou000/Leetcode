public class bestTimeToBuyStockII {
    public static void main(String[] args) {
        int[] prices = { 1, 2, 3, 4, 5 };
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        int result = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else if (prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice;
            }
            if (i >= 1 && i < prices.length - 1) {
                if (isSell(prices, i)) {
                    result += maxProfit;
                    minPrice = prices[i + 1];
                    maxProfit = 0;
                }
            }
        }
        System.out.println("最大利润: " + (result + maxProfit));
    }

    private static boolean isSell(int[] prices, int i) {

        if (prices[i + 1] > prices[i]) {
            return false;
        }

        return true;
    }
}
