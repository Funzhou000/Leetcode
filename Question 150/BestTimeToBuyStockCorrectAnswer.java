public class BestTimeToBuyStockCorrectAnswer {
    public static void main(String[] args) {

        // 使用了动态规划的思想
        // 每天检查当前是不是最低价，或者检查是否要更新最大利润
        int[] prices = { 3, 8, 2, 1, 2, 3 };
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else if (prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice;
            }
        }
        System.out.println("最大利润: " + maxProfit);
        System.out.println("最低价格: " + minPrice);
    }
}
